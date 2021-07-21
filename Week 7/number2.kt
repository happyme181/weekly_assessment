fun main() {
    reversedDigit ()
}

fun reversedDigit () :{
    
    var num = 348597
    var reversedNum = 0
    while (num != 0){
        val digit = num % 10
        reversedNum = reversedNum * 10 + digit
        num /= 10
    }

    println(reversedNum)

}