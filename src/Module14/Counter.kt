package Module14


//E14_3_4
fun main() {
    val counter = Counter()

    counter.countThree()
}

class Counter {
    private val list = mutableListOf<Int>()

    init {
        repeat(100) {
            list.add((1..3).random())
        }
    }

    fun countThree() {
        //посчитайте сколько значений раных 3 в списке list
        println(list.count{it == 3})
    }
}