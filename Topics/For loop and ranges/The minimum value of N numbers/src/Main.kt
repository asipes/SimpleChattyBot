fun main() {
    val n = readLine()!!.toInt()

    val result: Int = Array(n) { readLine()!!.toInt() }.sortedArray()[0]

    println(result)
}