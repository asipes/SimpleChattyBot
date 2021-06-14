fun main() {
    val students = arrayOfNulls<Int>(3)
    for (i in students.indices) {
        students[i] = readLine()!!.toInt()
    }

    val result: Int = students.sumBy { it!! / 2 + it!! % 2 }
    print(result)
}