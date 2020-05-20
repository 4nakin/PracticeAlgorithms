fun main(args: Array<String>) {
    val input = "Programming"

    val charMap = hashMapOf<Char, Int>()
    val charList = input.toCharArray()

    for (char in charList) {
        if (charMap.contains(char)) {
            charMap[char] = charMap[char]!! + 1
        } else {
            charMap[char] = 1
        }
    }

    for (char in charMap) {
        if (char.value > 1) {
            println(char)
        }
    }
}