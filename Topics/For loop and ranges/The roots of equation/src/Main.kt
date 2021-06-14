import kotlin.math.pow

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()

    for (i in 0..1000) {
        if (a * i.toDouble().pow(3.0).toInt() + b * i.toDouble().pow(2.0).toInt() + c * i + d == 0) {
            println(i)
        }
    }
}