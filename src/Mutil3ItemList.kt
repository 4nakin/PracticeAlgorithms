fun main(args: Array<String>) {
    val indexList = listOf<Int>(1, 7, 3, 4)
    val productList = mutableListOf<Int>()
//    for (i in indexList.indices) {
//        var multibleValue = 1
//        for (j in indexList.indices) {
//            if (j != i) {
//                multibleValue *= indexList[j]
//            }
//        }
//        productList.add(multibleValue)
//    }
//    println(productList)

    var totalMulti = 1
    for (i in indexList) {
        totalMulti *= i
    }
    for (i in indexList) {
        productList.add(totalMulti / i)
    }
    println(productList)
}