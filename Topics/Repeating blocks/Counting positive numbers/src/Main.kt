fun main() {
    val n = readLine()!!.toInt()
    var p = 0

    repeat(n) {
        val temp = readLine()!!.toInt()
        if (temp > 0) p++
    }

    println(p)
}