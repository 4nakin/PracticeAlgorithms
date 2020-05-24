package line

fun main(args: Array<String>) {
    val arrayParam = intArrayOf(2, 5, 7, 11, 15, 4)
    solution(arrayParam, 9).map {
        println(it)
    }
}

fun solution(arrayParam: IntArray, targetParam: Int): IntArray {
    // e.g. arrayParam = [2, 5, 7, 11, 15, 4]
    // e.g. targetParam = 9

    val map = mutableMapOf<Int, Int>()
    for(i in arrayParam.indices){
        val remainValue = targetParam - arrayParam[i]
        if(map.containsKey(remainValue)){
            return intArrayOf(map[remainValue]!!, i)
        }
        map[arrayParam[i]] = i
    }
    return intArrayOf()
}

