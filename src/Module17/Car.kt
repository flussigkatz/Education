package module17


sealed class Car

open class FastCar(var isFast: Boolean = false) : Car() //Класс с одним булевым полем, унаследованный от Car

class SlowCar(var isFast: Boolean = false) : Car() //Класс с одним булевым полем, унаследованный от Car


fun implementFastness(car: Car) {
    when (car) {
        is FastCar-> car.isFast = true
        is SlowCar-> car.isFast = false
    }
    //Так как мы перебрали все варианты, вариант с else не нужен
}

fun main() {
    val fastCar = FastCar()
    implementFastness(fastCar )
    val slowCar = SlowCar()
    implementFastness(slowCar)

    println("Is fast car. Fast: ${fastCar.isFast}")
    println("Is slow car. Fast: ${slowCar.isFast}")
}

