fun main() {
    val thread = Thread {
        for (i in 1..5) {
            println("Thread 1 - Itération $i")
            Thread.sleep(500)          }
    }
    val secondThread = Thread {
        for (i in 1..5) {
            println("Thread 2 - Itération $i")
            Thread.sleep(300)  // Pause
        }
    }
    thread.start()
    secondThread.start()
    thread.join()
    secondThread.join()
    println("Tous les threads sont terminés")
}