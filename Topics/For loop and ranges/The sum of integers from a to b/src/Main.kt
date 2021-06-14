fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    var result = 0

    for (i in a..b) {
        result += i
    }

    println(result)
}