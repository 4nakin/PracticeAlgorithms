fun main(args: Array<String>) {
    val first = "geeksforgeeks"
    val second = "forgeeksgeeks"

    println("First: $first | Second: $second | isAnagram: ${isAnagram(first, second)}")
}

fun isAnagram(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val secondStringBuilder: StringBuilder = java.lang.StringBuilder(second)
    val firstCharList = first.toCharArray()

    for (char in firstCharList) {
        val index = secondStringBuilder.indexOf(char)
        if (index >= 0) {
            secondStringBuilder.deleteCharAt(index)
        } else {
            return false
        }
    }
    return secondStringBuilder.isBlank()

}