fun main(args: Array<String>) {
    val input = "Hello"
    println(reverseRecursively(input))
    println(reverse(input))
}

fun reverseRecursively(input: String): String {
    if (input.length < 2) {
        return input
    }
    return reverseRecursively(input.substring(1)) + input[0]
}

fun reverse(input: String): String {
    val handleString = StringBuilder()
    val charList = input.toCharArray()
//    for(i in (charList.size -1) downTo  0){
//        handleString.append(charList[i])
//    }
    ((charList.size - 1) downTo 0).map { handleString.append(charList[it]) }
    return handleString.toString()
}