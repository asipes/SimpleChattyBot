fun main() {
    val array: Array<Boolean?> = arrayOfNulls<Boolean>(3)
    for (i in array.indices) {
        array[i] = readLine().toBoolean()
    }

    println(!(array[0] == true && array[1] == true) || array[2] == true)
}