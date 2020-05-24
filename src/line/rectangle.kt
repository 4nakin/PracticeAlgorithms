package line

fun main(args: Array<String>) {
    val input = listOf<IntArray>(intArrayOf(1, 4), intArrayOf(3, 4), intArrayOf(3, 10))
    solution(input.toTypedArray()).map {
        print(it)
    }
}

fun solution(v: Array<IntArray>): IntArray {
    var lastX: Int? = null
    var lastY: Int? = null

    val countX = hashMapOf<Int, Int>()
    val countY = hashMapOf<Int, Int>()

    for (point in v) {

        val x = point[0]
        val y = point[1]

        if (countX.contains(x)) {
            countX[x] = countX[x]!! + 1
        } else {
            countX[x] = 1
        }

        if (countY.contains(y)) {
            countY[y] = countY[y]!! + 1
        } else {
            countY[y] = 1
        }
    }

    for (item in countX) {
        if (item.value == 1) {
            lastX = item.key
        }
    }

    for (item in countY) {
        if (item.value == 1) {
            lastY = item.key
        }
    }
    if (lastX != null || lastY != null) {
        return intArrayOf(lastX!!, lastY!!)
    } else {
        return intArrayOf()
    }
}
