fun main() {
    val h1: Long = readLine()!!.toLong()
    val m1: Long = readLine()!!.toLong()
    val s1: Long = readLine()!!.toLong()
    val h2: Long = readLine()!!.toLong()
    val m2: Long = readLine()!!.toLong()
    val s2: Long = readLine()!!.toLong()

    val t1: Long = h1 * 3600 + m1 * 60 + s1
    val t2: Long = h2 * 3600 + m2 * 60 + s2
    println(t2 - t1)
}