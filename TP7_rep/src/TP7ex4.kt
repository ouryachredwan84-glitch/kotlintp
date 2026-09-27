fun main() {
    val new_users = mapOf("user1" to 13, "user2" to 20, "user3" to 30)
    users.putAll(new_users)
    println(users)
    users.remove("user1")
    println(users)

    println(users.containsValue(19))
    println("les clee de map user :${users.keys}")
    println("les valeurs de map user :${users.values}")
}
val users = mutableMapOf("amine" to 19, "radouan" to 22)