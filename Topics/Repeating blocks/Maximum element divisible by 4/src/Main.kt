fun main() {
    val n = readLine()!!.toInt()
    var result = 0

    repeat(n) {
        val temp = readLine()!!.toInt()
        if (temp % 4 == 0 && temp > result) {
            result = temp
        }
    }

    print(result)
}