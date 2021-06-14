fun main() {
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()

    print(n1 + n2 == 20 || n1 + n3 == 20 || n2 + n3 == 20)
}