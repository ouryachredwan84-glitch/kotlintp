import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = Job()
    val scope = CoroutineScope(Dispatchers.Default+job)

    scope.launch {
        delay(1000)
        println("Coroutine scope is start")
    }
    scope.launch {
        delay(3000)
        println("Coroutine scope is end")
    }
    delay(2000)
    scope.cancel()
    job.join()
    println("Coroutine scope is stop")
}