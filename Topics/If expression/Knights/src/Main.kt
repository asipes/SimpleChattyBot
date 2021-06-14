import kotlin.math.abs
import kotlin.math.pow

fun main() {
    val s1 = readLine()!!.split(" ")
    val s2 = readLine()!!.split(" ")

    val x = abs(s1[0].toDouble() - s2[0].toDouble())
    val y = abs(s1[1].toDouble() - s2[1].toDouble())

    println(
        if ((x.pow(2.0) + y.pow(2.0)).toInt() == 5) {
            "YES"
        } else {
            "NO"
        }
    )
}