fun main() {
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()

    if (n2 < n3) {
        print(n1 in n2..n3)
    } else {
        print(n1 in n3..n2)
    }
}