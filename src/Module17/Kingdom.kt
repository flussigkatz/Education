package module17

import Module17.Peasant


fun main() {
    Kingdom().apply {
        println(ruler)
        Ruler.rulerAnnouncement()
        ("казна " + treasury).yourHighness()
        upgradeArcher(archerList) { println(it) }
        upgradeWarrior(warriorList) { println(it) }
    }
}

class Kingdom {
    var ruler = Ruler("Ivan")
    var treasury = 0
    var heirList = mutableListOf<Heir>()
    val archerList = mutableListOf<Archer>()
    val warriorList = mutableListOf<Warrior>()
    val peasantList = mutableListOf<Peasant>()
    val workerTaxCollector = object : TaxCollector() {
        override fun collect(peasantList: MutableList<Peasant>) {
            val taxgroup = peasantList.filter { it.occupation == Peasant.Occupation.WORKER }
            treasury += taxgroup.size
        }
    }
    val bilderTaxCollector = object : TaxCollector() {
        override fun collect(peasantList: MutableList<Peasant>) {
            val taxgroup = peasantList.filter { it.occupation == Peasant.Occupation.BILDER }
            treasury += taxgroup.size * 2
        }
    }
    val farmerTaxCollector = object : TaxCollector() {
        override fun collect(peasantList: MutableList<Peasant>) {
            val taxgroup = peasantList.filter { it.occupation == Peasant.Occupation.FARMER }
            treasury += taxgroup.size * 3
        }
    }

    fun bornHeir(name: String) {
        val heir = Heir(name)
        heirList.add(heir)
    }

    fun recruitingArmy(index: Int) {
        if (index <= 10) {
            val armyUnit = Archer("Dagger")
            archerList.add(armyUnit)
        } else if (index <= 20) {
            val armyUnit = Archer("Bow")
            archerList.add(armyUnit)
        } else {
            val armyUnit = Warrior("Sword")
            warriorList.add(armyUnit)
        }
    }


    fun callPeasants(i: Int) {
        for (count in 1..i) {
            when {
                count % 2 == 0 -> peasantList.add(Peasant(Peasant.Occupation.BILDER))
                count % 3 == 0 -> peasantList.add(Peasant(Peasant.Occupation.FARMER))
                else -> peasantList.add(Peasant(Peasant.Occupation.WORKER))
            }
        }
    }

    fun upgradeWarrior(list: MutableList<Warrior>, operation: (MutableList<Warrior>) -> Unit) {
        list.forEach { it.weapon = "BFS" }

        operation(list)
    }

    fun upgradeArcher(list: MutableList<Archer>, operation: (MutableList<Archer>) -> Unit) {
        list.forEach { archer -> archer.weapon = "Composite bow" }

        operation(list)
    }

    fun givegiveFunToPesants(list: List<Peasant>) {
        list.forEach { peasant ->
            list.forEach {
                if (peasant.occupation == it.occupation) println("Привет, коллега!")
                else println("Вижу мы с вами занимаемся разным")
            }
        }
    }

    init {
        for (i in 1..10) bornHeir("Heir$i")
        for (i in 1..50) recruitingArmy(i)
        callPeasants(100)
        workerTaxCollector.collect(peasantList)
        bilderTaxCollector.collect(peasantList)
        farmerTaxCollector.collect(peasantList)
        givegiveFunToPesants(peasantList)
    }
}

fun fortunate(fortValue: Int): Int {
    if ((1..20).random() > 10) {
        return fortValue + (1..20).random()
    } else {
        return fortValue - (1..20).random()
    }
}

open class Ruler(val name: String) {
    var power: Int = (50..100).random()
    var intellect: Int = (60..200).random()

    companion object {
        fun rulerAnnouncement() {
            println("Его Высокое Благородие Король в здании.")
        }
    }

    override fun toString(): String {
        return "$name сила=$power интелект=$intellect"
    }

}

class Heir(name: String) : Ruler(name) {
    init {
        power = fortunate(power)
        intellect = fortunate(intellect)
    }

}

data class Archer(var weapon: String, val armor: String = "LightArmor")


data class Warrior(var weapon: String, val armor: String = "HardArmor")


fun Any.yourHighness() = println("Ваше высоченство, " + this)

abstract class TaxCollector : CollectTaxes

interface CollectTaxes {
    fun collect(peasantList: MutableList<Peasant>) {}
}
