class Maclass: Runnable{
    override fun run() {

       for (i in 'A'..'Z'){
            println(i)
            Thread.sleep(500)
        }

    }
}

fun main(){
    var maclass = Maclass()
    Thread(maclass).start()
}