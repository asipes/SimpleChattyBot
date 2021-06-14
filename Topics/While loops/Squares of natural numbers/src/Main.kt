fun main() {
    val num = readLine()!!.toInt()

    for (i in 1..num) {
        val tmp = i * i
        if (tmp <= num) {
            println(tmp)
        } else {
            break
        }
    }
}