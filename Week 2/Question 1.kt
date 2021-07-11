fun main() {
    var name = "Jane"
    if(name == "Jane"){
        println("My name is Jane")
    }

    var num = 88
    if (num < 50){
        println ("This number is less than 50")
    }

    var color = "black"
    if (color == "white"){
        println ("This color is not black")
    }

    val num1 = 5
    val num2 = 9
    if (num1 > num2){
      println ("$num1 is greater than $num2")
    }else{
        println ("$num2 is greater than $num1")
    }

    if (10 <= 15){
        println ("True")
    }else{
        println ("False")
    }

    var myName = "onyedikachi"
    if (myName.length == 9){
        println ("This is true")
    }else{
        println ("This is false")
    }










    var namesOfStudent: String = "Mary"
    var result: String = when {
       namesOfStudent == "Jane" -> "My name is Jane"
        namesOfStudent == "Joy" -> "My name is Joy"
        namesOfStudent == "Amaka" -> "My name is Amaka"
        namesOfStudent == "Favour" -> "My name is Favour"
        namesOfStudent == "Josh" -> "My name is Josh"
        else -> "That is not my name"
    }
}




