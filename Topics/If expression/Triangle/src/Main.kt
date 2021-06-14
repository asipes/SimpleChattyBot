fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    print(
        if (a + b > c && a + c > b && b + c > a) {
            "YES"
        } else {
            "NO"
        }
    )
}