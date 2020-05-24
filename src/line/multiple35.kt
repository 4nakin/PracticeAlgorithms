package line

fun main(args: Array<String>) {
    val input = readLine()?.trim() ?: return
    solve(input.toInt())
}

private fun solve(input: Int) {
    if (input < 1) return
    (1..input).map {
        var content = "$it"
        if(it % 15 == 0){
            content = "FizzBuzz"
        }else if(it % 3 == 0){
            content = "Fizz"
        }else if(it % 5 == 0){
            content = "Buzz"
        }
        println(content)
    }
}