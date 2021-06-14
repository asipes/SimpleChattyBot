fun main() {
    val c = readLine()!!.first()

    print(c.isUpperCase() || c in '1'..'9')
}