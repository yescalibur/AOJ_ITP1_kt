fun main() {
    val (stra, strb) = readLine()!!.split(" ")

    val a = stra.toInt()
    val b = strb.toInt()

    val str =
        if(a > b) "a > b"
        else if (a < b) "a < b"
        else "a == b"

    println(str)
}