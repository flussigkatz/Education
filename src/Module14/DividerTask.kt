package Module14


//E14_3_3
class DividerTask {
        val list = listOf(
                Person("Ann", "Builder"),
                Person("Bob", "Worker"),
                Person("Judy", "Builder"),
                Person("Doris", "Worker"),
                Person("Tommy", "Worker"),
                Person("Jim", "Builder"),
                Person("Sam", "Worker"),
                Person("Colin", "Builder"),
                Person("Connor", "Worker"),
                Person("Vick", "Builder"),
                Person("Polly", "Worker"),
                Person("Angela", "Builder")
        )

        fun divideAndPrint() {
            //напишите логику разделения
            val profGrop = list.groupBy { it.profession }
            println(profGrop)
        }
    }

    data class Person(val name: String, val profession: String)

fun main() {
    val dividerTask = DividerTask()

    dividerTask.divideAndPrint()
}