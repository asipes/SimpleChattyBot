fun main() {
    val s1 = readLine()!!
    val s2 = readLine()!!

    val i1 = s1.split(" ").map(String::toInt).sorted()
    val i2 = s2.split(" ").map(String::toInt).sorted()

    println(
        if (i1[0] == i2[0] && i1[1] == i2[1] && i1[2] == i2[2]) {
            "Box 1 = Box 2"
        } else if (i1[0] <= i2[0] && i1[1] <= i2[1] && i1[2] <= i2[2]) {
            "Box 1 < Box 2"
        } else if (i1[0] >= i2[0] && i1[1] >= i2[1] && i1[2] >= i2[2]) {
            "Box 1 > Box 2"
        } else {
            "Incomparable"
        }
    )
}