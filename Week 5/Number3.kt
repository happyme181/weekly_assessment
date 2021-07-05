import java.lang.StringBuilder

fun main() {
    println (removeVowels("I Love Kotlin Programming Language"))
}

fun removeVowels (s:String):String{
    val remove = StringBuilder()
    for (c in s){
        if(c!= 'A' && c!= 'a'
            && c!= 'E' && c!= 'e'
            && c!= 'I' && c!= 'i'
            && c!= 'O' && c!= 'o'
            && c!= 'U' && c!= 'u'){

            remove.append(c)
        }
    }
    return remove.toString()
}