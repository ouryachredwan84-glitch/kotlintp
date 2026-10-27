
import kotlinx.coroutines.*

fun main() = runBlocking {

    val result1 = async {
        delay(2000)
        10 + 20
    }

    val result2 = async {
        delay(1000)
        40 + 10
    }

    val number1 = result1.await()
    val number2 = result2.await()

    println("Résultat 1 : $number1")
    println("Résultat 2 : $number2")
    println("Total : ${number1 + number2}")
}
