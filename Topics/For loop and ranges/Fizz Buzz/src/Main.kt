fun main() {
    val s = readLine()!!.toInt()
    val f = readLine()!!.toInt()

    for (i in s..f) {
        if (i % 3 == 0) {
            print("Fizz")
        }
        if (i % 5 == 0) {
            print("Buzz")
        }
        if (i % 3 != 0 && i % 5 != 0) {
            print(i)
        }
        println()
    }
}