fun main() {
    val n = readLine()!!.toInt()
    val array = Array(n) { readLine()!!.toInt() }

    var result = 1
    var tempResult = 0
    var tempNum = Int.MIN_VALUE

    for (i in array.indices) {
        if (array[i] >= tempNum) {
            tempResult++
        } else {
            if (tempResult > result) {
                result = tempResult
            }
            tempResult = 1
        }
        tempNum = array[i]
    }

    if (result < tempResult) result = tempResult
    println(result)
}