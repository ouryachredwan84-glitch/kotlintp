class DatabaseConnection{
    fun connect(){
        println("Connecting...")
    }
}
class DatabaseManager{
    lateinit var  connection : DatabaseConnection

    fun connecter(){
        connection = DatabaseConnection()
    }
    fun etat(){

        try{
            connection.connect()
        }catch(e:Exception){
            println("Connection not connected ${e.message}")
        }
    }
}

fun main(){
    val manager = DatabaseManager()
    manager.connecter()
    manager.etat()
}

