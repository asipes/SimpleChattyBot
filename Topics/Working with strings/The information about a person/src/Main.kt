fun main() {
    val t = readLine()
    val c = t!!.first()
    val s = t!!.split(" ")[1]
    val n = t!!.split(" ")[2].toInt()

    print("$c. $s, $n years old")
}