fun main() {
    val n = readLine()!!.toInt()

    print(
        if (n in -14..12 || n in 15..16 || n >= 19) {
            "True"
        } else {
            "False"
        }
    )
}