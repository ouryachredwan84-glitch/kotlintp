inline fun processStrings(
    list: List<String>,
    evaluation: (String) -> Boolean,
    noinline operation: (String) -> Unit
) {
    for (x in list) {
        if (evaluation(x)) {
            operation(x)
        }
    }
}

fun main() {
    val emails = listOf(
        "redouan@gmail.com",
        "sara@hotmail.com",
        "yassine@gmail.com",
        "imane@hotmail.com",
        "hamza@gmail.com",
        "salma@hotmail.com",
        "aya@gmail.com",
        "meryem@hotmail.com",
        "karim@gmail.com",
        "hajar@hotmail.com",
        "nour@gmail.com",
        "adam@hotmail.com",
        "oumaima@gmail.com",
        "zakaria@hotmail.com",
        "fatima@gmail.com"
    )

    processStrings(emails,
        { it.contains("@gmail.com") }
    ) {
        println("$it true")
    }
}