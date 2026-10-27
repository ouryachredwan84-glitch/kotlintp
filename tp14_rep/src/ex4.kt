
import kotlinx.coroutines.*

fun main() = runBlocking {

    val job: Job = launch {
        delay(2000)
        println("traitement")
    }

    println("Job actif : ${job.isActive}")

    job.cancel()

    println("Job actif après annulation : ${job.isActive}")

    job.join()

    println("Fin de programme")
}
