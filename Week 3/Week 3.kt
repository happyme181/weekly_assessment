fun main() {
    println ((1..100). map { i -> mapOf(0 to i, i % 3 to "Fizz", i % 5 to "Buzz", i % 15 to "FizzBuzz") [0] })

    var myString = "Good Food"
    var reverseString = reverseString(myString)
    println (reverseString)

}

fun reverseString (myString: String) : String {
    var reverseString = ""

    for (i in myString.length - 1 downTo 0){
        reverseString += myString [i]
    }
    return  reverseString
}