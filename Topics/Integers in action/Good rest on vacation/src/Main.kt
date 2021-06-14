fun main() {
    val days = readLine()!!.toInt()
    val foodCost = readLine()!!.toInt()
    val flightCost = readLine()!!.toInt()
    val nightCost = readLine()!!.toInt()

    println(days * foodCost + flightCost * 2 + (days - 1) * nightCost)
}