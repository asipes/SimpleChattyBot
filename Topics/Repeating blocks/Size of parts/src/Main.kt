fun main() {
    val n = readLine()!!.toInt()

    var perfect = 0
    var larger = 0
    var smaller = 0

    repeat(n) {
        val temp = readLine()!!.toInt()
        if (temp == 0) {
            perfect++
        } else if (temp == 1) {
            larger++
        } else if (temp == -1) {
            smaller++
        }
    }

    println("$perfect $larger $smaller")
}