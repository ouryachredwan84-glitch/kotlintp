fun calculate(a: Int, b: Int,calcul:(Int,Int)->Int): Int {
    return calcul(a,b)
}

class Arithmeticexception(message: String) : Exception(message)

fun main(){
    val a = readln()!!.toInt()
    val b = readln()!!.toInt()

    var result = calculate(a, b){a, b->a+b}
    var result2 = calculate(a, b){a, b->a-b}
    var result3 = calculate(a, b){a, b->a*b}
    var result4 = try {
        calculate(a, b) {
            x, y -> if (y == 0) {
                throw Arithmeticexception("Division par zéro")
            }
            x / y
        }
    } catch (e: Arithmeticexception) {
        println(e.message)
        0
    }
    println(result)
    println(result2)
    println(result3)
    println(result4)
}