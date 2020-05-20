fun main(args: Array<String>) {
    val inputList = listOf<Int>(-20, 34, 21, -87, 92)
    var largest = Int.MIN_VALUE
    var smallest = Int.MAX_VALUE

    for(item in inputList){
        if(largest < item){
            largest = item
        }
        if(smallest > item){
            smallest = item
        }
    }

    println("Large: $largest")
    println("Small: $smallest")
}