fun main() {
    while (true){
        var (a, b) = readLine()!!.split(" ").map(String::toInt).sorted()

        if(a == 0 && b == 0) break

        println("""${a} ${b}""")
    }
}