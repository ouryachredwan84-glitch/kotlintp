import kotlin.concurrent.thread

fun main(){
    var thread1 = Thread {
        try {
            for (i in 1..10) {
                println(i)
                Thread.sleep(1000)
            }
        }catch (e : InterruptedException){
            println("comptage a été arrêté. : ${e.message}")
        }

    }

    thread1.start()
    Thread.sleep(5000)
    thread1.interrupt()
    thread1.join()


}