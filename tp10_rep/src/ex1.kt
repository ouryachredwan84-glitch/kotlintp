fun main(){
    val essaie = Thread{
        for (i in 1..10) {
            println("$i")
            Thread.sleep(1000)
        }
    }
    essaie.start()
    essaie.join()
    println("TRAITEMENT DE AFICHHAGE DE 1 A 10 EST FINI")
}