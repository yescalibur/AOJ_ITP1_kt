fun main() {
    val (stra, strb) = readLine()!!.split(" ")

    val a = stra.toInt()
    val b = strb.toInt()

//    print(a * b)
//    print(" ")
//    println(2*a + 2*b)
    println("""${a * b} ${2*a + 2*b}""")
}