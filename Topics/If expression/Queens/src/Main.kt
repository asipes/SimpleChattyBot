import kotlin.math.abs

fun main() {
    val s1 = readLine()!!.split(" ")
    val s2 = readLine()!!.split(" ")

    val x1 = s1[0].toInt()
    val y1 = s1[1].toInt()
    val x2 = s2[0].toInt()
    val y2 = s2[1].toInt()

    print(if (x1 == x2 || y1 == y2 || abs(x1 - x2) == abs(y1 - y2)) "YES" else "NO")
}