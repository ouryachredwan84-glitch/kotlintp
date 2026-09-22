import javax.print.DocFlavor

fun main(){
    val pay1 =   CashPayment(10023.0)
    val pay2 = CardPayment(10023.0,"15412654546545685")
    val pay3 = DigitalPayment(123.0,"1654546545685")

    pay(pay1)
    println("####################################################")
    pay(pay2)
    println("####################################################")
    pay(pay3)
}
/*sealed class Payment(){
//    open fun pay(x: String){
        println(" le type de paiement et $x")
//    }
//}
class CashPayment(var amount:Double,var cardNumber: Int): Payment(){
    override fun pay(x: String) {
        super.pay(x)
        println(" cardNumber = $cardNumber")
        println("amount $amount")
    }
}
class CardPayment(var amount:Double,var cardNumber: String): Payment(){
    override fun pay(x: String) {
        super.pay(x)
        println(" cardNumber = $cardNumber")
        println("amount $amount")
    }
}
class DigitalPayment(var amount:Double,var cardNumber: String): Payment(){
    override fun pay(x: String) {
        super.pay(x)
        println(" cardNumber = $cardNumber")
        println("amount $amount")
    }
}*/

sealed class Payment
class CashPayment(val amount: Double):Payment()
class CardPayment(val amount: Double,var cardnumber:String):Payment()
class DigitalPayment(val amount: Double,var cardnumber:String):Payment()

fun pay(p: Payment){
    when (p){
        is CashPayment -> {
            println("Payment is CashPayment")
            println("amount ${p.amount}")
        }
        is CardPayment -> {
            println("Payment is CardPayment")
            println("amount ${p.amount}")
            println("cardnumber ${p.cardnumber}")
        }
        is DigitalPayment -> {
            println("Payment is DigitalPayment")
            println("amount ${p.amount}")
            println("cardnumber ${p.cardnumber}")
        }
    }
}
//p:Payment hna hiya parametre payment type dylo howa had sealed class Payment
