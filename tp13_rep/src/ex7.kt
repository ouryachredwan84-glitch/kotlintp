inline fun findNumber(
    list: List<Int>,
    nbr: Int,
    lambda: (Int) -> Boolean
): Boolean {

    for (i in list) {
        if (lambda(i)) {
            return true
        }
    }

    return false
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val nbr = 2

    val result = findNumber(list, nbr) { it == nbr }

    println(result)
}