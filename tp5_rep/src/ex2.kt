fun main(){
    var res1 = Success("reda","Success")
    var res2 = Failure("rayan","Failure")
    var res3 = Loading("ahmed","Loading")

    printresult(res1)
    printresult(res2)
    printresult(res3)

}
sealed class OperationResult
class Success(var data: String,var errorMessage: String): OperationResult()
class Failure(var data: String,var errorMessage: String) : OperationResult()
class Loading(var data: String,var errorMessage: String) : OperationResult()

fun printresult(res:OperationResult){
    when(res){
        is Loading -> {
            println("Loading...")
            println(res.data)

        }
        is Success -> {
            println("Success")
        }
        is Failure -> {
            println("Failure")
        }
    }
}
