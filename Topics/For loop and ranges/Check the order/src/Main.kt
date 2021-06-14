fun main() {
    val n = readLine()!!.toInt()
    val array: Array<Int> = Array(n) { readLine()!!.toInt() }
    val tempArray = array.sorted()
    var isSorted = true

    for (i in array.indices) {
        if (array[i] != tempArray[i]) {
            isSorted = false
        }
    }

    println(
        if (isSorted) "YES" else "NO"
    )
}