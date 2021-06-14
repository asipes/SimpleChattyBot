fun main() {
    var result = 0

    do {
        val temp = readLine()!!.toInt()
        result += temp
    } while (temp != 0)

    println(result)
}