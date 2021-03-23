package module17

import Module17.Peasant


fun main() {
    val kingdom = Kingdom()
    kingdom.taxCollector.collect(kingdom.peasantList)
    Ruler.rulerAnnouncement()
    println(Kingdom.treasury)
}

class Kingdom {
    companion object {
        var treasury = 0
    }
    var ruler = Ruler("Ivan")
    var heirList = mutableListOf<Heir>()
    val archerList = mutableListOf<Archer>()
    val warriorList = mutableListOf<Warrior>()
    val peasantList = mutableListOf<Peasant>()
    val taxCollector = TaxCollector()
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

    init {
        for (i in 1..10) bornHeir("Heir$i")
        for (i in 1..50) recruitingArmy(i)
        for (i in 1..100) {
            when {
                i % 2 == 0 -> peasantList.add(Peasant(Peasant.Occupation.BILDER))
                i % 3 == 0 -> peasantList.add(Peasant(Peasant.Occupation.FARMER))
                else -> peasantList.add(Peasant(Peasant.Occupation.WORKER))
            }
        }
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
        return "Ruler($name power=$power intellect=$intellect)"
    }

}

class Heir(name: String) : Ruler(name) {
    init {
        power = fortunate(power)
        intellect = fortunate(intellect)
    }

}


data class Archer(val weapon: String, val armor: String = "LightArmor")

data class Warrior(val weapon: String, val armor: String = "HardArmor")

class TaxCollector : CollectTaxes {
    override fun collect(peasantList: MutableList<Peasant>) {
        for (i in 0 until peasantList.size)
        if (peasantList.get(i).occupation == Peasant.Occupation.FARMER) {
            Kingdom.treasury += 3
        } else if (peasantList.get(i).occupation == Peasant.Occupation.BILDER) {
            Kingdom.treasury += 2
        } else Kingdom.treasury += 1
    }
}

interface CollectTaxes {
    fun collect(peasantList: MutableList<Peasant>) {}
}