fun main() {
    val n = readLine()!!.toInt()
    val array = Array(n) { readLine()!!.toInt() }

    var max: Int = Int.MIN_VALUE

    for (i in array.indices) {
        for (j in array.indices) {
            if (i != j && array[i] * array[j] > max) {
                max = array[i] * array[j]
            }
        }
    }

    if (array.size == 1) {
        max = array[0]
    }
    println(max)
}