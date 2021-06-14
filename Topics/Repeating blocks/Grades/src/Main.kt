fun main() {
    val n = readLine()!!.toInt()

    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(n) {
        val temp = readLine()!!.toInt()
        if (temp == 5) a++
        if (temp == 4) b++
        if (temp == 3) c++
        if (temp == 2) d++
    }

    print("$d $c $b $a")
}