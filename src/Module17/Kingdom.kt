package module17


fun main() {
    val kingdom = Kingdom()
    println(kingdom.ruler)
    println(kingdom.heirList)
    println(kingdom.archerList)
    println(kingdom.warriorList)
}

class Kingdom {
    var ruler = Ruler("Ivan")
    var heirList = mutableListOf<Heir>()
    val archerList = mutableListOf<Archer>()
    val warriorList = mutableListOf<Warrior>()
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
    }
}

fun fortunate (fortValue: Int): Int {
    if ((1..20).random() > 10) {
        return fortValue + (1..20).random()
    } else {
        return fortValue - (1..20).random()
    }
}

open class Ruler(val name: String) {
    var power: Int = (50..100).random()
    var intellect: Int = (60..200).random()
    override fun toString(): String {
        return "Ruler(Name='$name', power=$power, intellect=$intellect)"
    }

}

class Heir(name: String): Ruler(name){
    init{
        power = fortunate(power)
        intellect = fortunate(intellect)
    }

}


data class Archer(val weapon: String, val armor: String = "LightArmor")

data class Warrior(val weapon: String, val armor: String = "HardArmor")