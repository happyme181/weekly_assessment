fun main() {
    var number : Int = 1
    while (number <= 100) {
        print (number)
        number ++
    }
    var myNumbers : Array <Int> = arrayOf (0,1,2,3,4,5,6,7,8,9,10)
    for (aNumber in myNumbers){
        if (aNumber == 4 ){
            continue
        }else if (aNumber == 5){
            continue
        }
        println (aNumber)
    }

    var printNumbers : Array <Int> = arrayOf (10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)
    for (myNum in printNumbers){
        if (myNum <= 20 && myNum % 2 == 0){
            println (myNum)
        }
        if (myNum >= 20 && myNum % 2 != 0){
            println (myNum)

        }

    }
}