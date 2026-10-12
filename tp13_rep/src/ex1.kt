fun transformList(list: List<Int>,transformation: (Int)->Int): List<Int> {
    val result = mutableListOf<Int>()
    for(i in list){
        result.add(transformation(i))
    }
    return result

}

fun main(){
    val list = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    val result = transformList(list){ a-> a*a }
    println(result)
}


