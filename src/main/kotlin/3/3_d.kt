fun main() {
    val (a, b, c) = readLine()!!.split(" ").map{it.toInt()}
    println((a..b).count { c % it == 0 })
}