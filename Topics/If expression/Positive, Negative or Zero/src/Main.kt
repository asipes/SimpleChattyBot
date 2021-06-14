fun main() {
    val n = readLine()!!.toInt()

    print(
        if (n > 0) {
            "positive"
        } else if (n < 0) {
            "negative"
        } else {
            "zero"
        }
    )
}