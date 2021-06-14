fun main() {
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()
    val n4 = readLine()!!.toInt()
    val n5 = readLine()!!.toInt()

    val r1 = n1..n2
    val r2 = n3..n4

    print(n5 in r1 && n5 in r2)
}