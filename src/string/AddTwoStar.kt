package string

fun main(args: Array<String>) {
    val n = 5

    var form = ""
    for (i in 1..(n + 3)) form += "$i"
    var handleString: String
    for (i in 1..n) {
        handleString = form
        val prefix = handleString.substring(0, i)
        val postfix = handleString.substring(i + 2, handleString.length)

        println("$prefix**$postfix")
    }
}