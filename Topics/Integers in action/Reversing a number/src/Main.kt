fun main() {
    var num = readLine()!!.toInt()
    var result = 0

    while (num > 0) {
        result *= 10
        result += num % 10
        num /= 10
    }

    print(result)
}