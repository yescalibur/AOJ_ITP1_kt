fun main() {
    while (true) {
        val (a, b, c) = readLine()!!.split(" ")
        when(b) {
            "+" -> println(a.toInt() + c.toInt())
            "-" -> println(a.toInt() - c.toInt())
            "*" -> println(a.toInt() * c.toInt())
            "/" -> println(a.toInt() / c.toInt())
            "?" -> break
        }
    }
}