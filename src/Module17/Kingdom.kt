package Module17

import java.util.*

fun main() {
    val kingdom = Kingdom()
    for (i in 1 until 10) {kingdom.bornHeir("Heir$i")}
    for (i in 1 until 50) {kingdom.recruitingArmy(i)}
    println(kingdom.ruler.kingName)
    println(kingdom.heirList.size)
    println(kingdom.heirList.get(0).heirName)
}

class Kingdom {
    var ruler = Ruler()
    var heirList = mutableListOf<Heir>()
    fun bornHeir(heirName: String) {
        var heir = Heir(heirName)
        heirList.add(heir)
    }
    fun recruitingArmy(index: Int) {
        if (index <= 10) {
            var armyUnit = Archer("Dagger")
        }
    }

}

open class Ruler() {
    val kingName: String = "Ivan"
    val power: Int = 100
    val intellect: Int = 200

}

class Heir(val heirName: String? = null) {
}

data class Army(val prof: String, val weapon: String) {
    val archerList = mutableListOf<Archer>()
    val warriorList = mutableListOf<Warrior>()
}

class Archer(weapon: String) {
    val armor: String = "LightArmor"
}

class Warrior(armor: String = "HardArmor", weapon: String)