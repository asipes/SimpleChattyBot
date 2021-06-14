import java.util.*

fun main() {
    var balance = readLine()!!.toInt()
    val s = readLine()!!.split(" ").map(String::toInt)
    var isError = false

    for (buy in s) {
        if (balance >= buy) {
            balance -= buy
        } else {
            println("Error, insufficient funds for the purchase. You have $balance, but you need $buy.")
            isError = true
            break
        }
    }

    if (!isError) {
        println("Thank you for choosing us to manage your account! You have $balance money.")
    }
}