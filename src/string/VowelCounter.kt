package string

fun main(args: Array<String>) {
    val input = "progra mming"
    println(countVowelConsonants(input)[1])
}

fun countVowelConsonants(input: String): IntArray{
    val charList = input.toCharArray()
    val vowelStr = "aeiouAEIOU"
    var countVowel = 0
    var countConsonants = 0

    for(char in charList){
        val unicode = char.toInt()
        if((unicode in 65..90) || (unicode in 97..122)){
            if(vowelStr.contains(char)){
                countVowel++
            }else{
                countConsonants++
            }
        }
    }
    return intArrayOf(countVowel, countConsonants)
}