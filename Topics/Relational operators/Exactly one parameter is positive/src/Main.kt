fun main() {
    val nums = arrayOfNulls<Int>(3)
    for (i in nums.indices) {
        nums[i] = readLine()!!.toInt()
    }

    var result = 0

    for (num in nums) {
        if (num != null) {
            if (num <= 0) {
                result++
            }
        }
    }

    print(result == 2)
}