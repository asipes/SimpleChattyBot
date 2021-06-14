fun main() {
    val cs = arrayOfNulls<Char>(4)

    for (i in cs.indices) {
        cs[i] = readLine()!!.first()
    }

    for (c in cs) {
        println(c!! - 1)
    }
}