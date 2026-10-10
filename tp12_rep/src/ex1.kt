fun findmax(list:List<Int>,lambda:(Int,Int)-> Int):Int{
    var max = list[0]
    for(i in 1 until list.size){
        max = lambda(max,list[i])
    }
    return max
}

fun main(){
    val list = listOf(1,2,3,4,100,5,6,7,8,9,10)
    val list2= list.shuffled()

    val resultat = findmax(list2){ a,b-> if (a>b) a else b }
    println(resultat)
}