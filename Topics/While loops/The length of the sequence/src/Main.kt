fun main() {
    var count = 0

    do {
        val num = readLine()!!.toInt()
        if (num != 0) {
            count++
        }
    } while (num != 0)

    println(count)
}