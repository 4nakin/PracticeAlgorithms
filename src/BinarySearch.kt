fun main(args: Array<String>) {
    val source = intArrayOf(1, 5, 7, 9, 14, 15, 17, 22, 55, 66)
    println(binarySearch(source, 22))
}

fun binarySearch(list: IntArray, target: Int): Int {
    var lowerBound = 0
    var upperBound = list.size - 1
    var midIndex:Int

    while (lowerBound < upperBound) {
        midIndex = (lowerBound + upperBound) / 2

        when {
            list[midIndex] < target -> {
                lowerBound = midIndex + 1
            }
            list[midIndex] > target -> {
                upperBound = midIndex - 1
            }
            else -> {
                return midIndex
            }
        }

    }
    return -1
}