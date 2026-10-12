fun applyOperation(a: Int, b: Int,
                   operation: (Int,Int)->Int ): Int {
    return operation(a, b)
}

fun main(){
    val a= readln()!!.toInt()
    val b= readln()!!.toInt()
    val result = applyOperation(a,b){a, b-> a+b}
    println(result)
}