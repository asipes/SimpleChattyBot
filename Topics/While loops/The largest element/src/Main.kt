fun main() {
    var result = Int.MIN_VALUE

    do {
        val n = readLine()!!.toInt()
        if (n > result) {
            result = n
        }
    } while (n != 0)

    println(result)
}