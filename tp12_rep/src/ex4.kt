val anonym = fun(x:Int): Boolean{
    if (x>0){
        return true
    }else return false
}

fun main(){
    val a = readln()!!.toInt()
    if(anonym(a)){
        println("positive")
    }else println("negative")

}