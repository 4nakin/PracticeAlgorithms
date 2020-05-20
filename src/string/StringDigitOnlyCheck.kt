import java.util.regex.Pattern

fun main(args: Array<String>) {
    val inputs = listOf("123", "-123", "123.12", "abcd123")

    val pattern = "\\-?\\d+"
    for (item in inputs) {
        println("$item is number: ${Regex(pattern).matches(item)}")
    }
}