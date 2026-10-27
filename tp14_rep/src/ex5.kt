
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {

    val transfer = flow {
        for (i in 1..10) {
            emit(i)
        }
    }

    println("Method map")
    transfer.map { it * 2 }
        .collect { println(it) }

    println("Method filter")
    transfer.filter { it % 2 == 0 }
        .collect { println(it) }

    println("Method take")
    transfer.take(2)
        .collect { println(it) }
}
