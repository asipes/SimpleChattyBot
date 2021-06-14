fun main() {
    val num = readLine()!!.toInt()

    if (num % 2 == 0) {
        print(num + 2)
    } else {
        print(num + 1)
    }
}