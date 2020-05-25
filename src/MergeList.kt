fun main(args: Array<String>) {
    val myList = listOf<Int>(3, 4, 6, 10, 11, 15)

    val alicesList = listOf<Int>(1, 5, 8, 12, 14, 19)

    val mergeList = mutableListOf<Int>()
    mergeList.addAll(myList)

    for (j in alicesList.indices) {
        for (i in mergeList.indices) {
            if (alicesList[j] < mergeList[i]) {
                mergeList.add(i, alicesList[j])
                break
            } else if (j == alicesList.size - 1) {
                mergeList.add(mergeList.size, alicesList[j])
                break
            }
        }
        println(mergeList)
    }
    println(mergeList)
}