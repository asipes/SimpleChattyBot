fun main() {
    val s = readLine()
    val n = readLine()!!.toInt()
    val c = s!![n - 1]

    print("""Symbol # $n of the string "$s" is '$c'""")
}