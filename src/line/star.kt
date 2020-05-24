package line

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    var rowStar = ""
    (1..a).map { rowStar += "*" }
    (1..b).map { println(rowStar) }
}