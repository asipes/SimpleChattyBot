fun main() {
    val h1 = readLine()!!.toInt()
    val h2 = readLine()!!.toInt()
    val h3 = readLine()!!.toInt()

    print(h2 in h1..h3 || h2 in h3..h1)
}