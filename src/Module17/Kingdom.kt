package Module17


fun main() {
    val kingdom = Kingdom()
    for (i in 1 .. 10) {kingdom.bornHeir("Heir$i")}
    for (i in 1 .. 50) {kingdom.recruitingArmy(i)}
    println(kingdom.ruler)
    println(kingdom.heirList.size)
    println(kingdom.heirList)
    println(kingdom.archerList.size)
    println(kingdom.warriorList.size)
}

class Kingdom {
    var ruler = Ruler()
    var heirList = mutableListOf<Heir>()
    val archerList = mutableListOf<Archer>()
    val warriorList = mutableListOf<Warrior>()

    fun bornHeir(heirName: String) {
        var heir = Heir(heirName)
        heirList.add(heir)
    }

    fun recruitingArmy(index: Int) {
        if (index <= 10) {
            var armyUnit = Archer("Dagger")
            archerList.add(armyUnit)
        } else if (index <= 20) {
            var armyUnit = Archer("Bow")
            archerList.add(armyUnit)
        } else {
            var armyUnit = Warrior("Sword")
            warriorList.add(armyUnit)
        }
    }
}

open class Ruler(var power: Int = 100, val intellect: Int = 200) {
    val kingName: String = "Ivan"
//    val power: Int = 100
//    val intellect: Int = 200
    override fun toString(): String {
        return "Ruler(kingName='$kingName', power=$power, intellect=$intellect)"
    }

}

class Heir(val heirName: String): Ruler(){
//    TODO extends Ruler
    override fun toString(): String {
        return "Heir(heirName='$heirName')"
    }
}


data class Archer(val weapon: String, val armor: String = "LightArmor")

data class Warrior(val weapon: String, val armor: String = "HardArmor")