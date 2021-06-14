fun main() {
    val age = readLine()!!.toInt()
    val range = 18..59

    print(age in range)
}