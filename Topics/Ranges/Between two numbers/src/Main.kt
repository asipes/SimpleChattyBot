fun main() {
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()

    val r = if (n2 > n3) n3..n2 else n2..n3

    print(n1 in r)
}