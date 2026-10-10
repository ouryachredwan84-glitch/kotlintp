
fun calculer(x: Int, y: Int, operation: (Int, Int) -> Int): Int{

    return operation(x, y)
}

fun main(){
    val a = 10
    val b= 20
    val Soustraire = calculer(a,b,{x,y -> x-y})
    val Multiplier = calculer(a,b,{x,y -> x*y})
    val Additionner = calculer(a, b, { x, y -> x + y })

    println("Addition = $Additionner")
    println("Multiplier = $Multiplier")
    println("Soustraire = $Soustraire")
}