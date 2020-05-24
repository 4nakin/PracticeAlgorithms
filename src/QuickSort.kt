fun main(args: Array<String>) {
    val source = mutableListOf(3,7,8,5,2,1,9,6,4)
    quickSort(source, 0, source.size - 1)
    println(source)
}

fun quickSort(list: MutableList<Int>, left: Int, right: Int) {
    val mid = (left + right) / 2
    val pivot = list[mid]

    var i = left
    var j = right

    while (i <= j) {
        println(list)
        while (list[i] < pivot){
            i++
        }
        while (list[j] > pivot){
            j--
        }

        if(i <= j){
            val t =  list[j]
            list[j] = list[i]
            list[i] = t
            i++
            j--
        }
    }
    if(left < j){
        quickSort(list, left, j)
    }

    if(right > i){
        quickSort(list, i, right)
    }
}