fun main() {
    var myComputer: Computer = Computer (4)


    var myPhone : Phone = Phone("Infinix")
    println ()

    var myCountry : Country = Country("Asaba")

    var myVehicle : Vehicle = Vehicle("Black")

    var myAnimal : Animal = Animal ("5grams")


}
class Computer (){
    var comModel : String = ""
    var comRam : Int = 0
    var comRom : Int = 0
    var comColor : String = ""
    var comPrice : Double = 0.0

    constructor (comRam: Int) : this() {
        this.comRam = comRam
    }
    fun getAComRam () : Int{
        return this.comRam
    }
}
class Phone (){
    var phoneType : String = ""
    var phoneRam : Int = 0
    var phoneRom : Int = 0
    var phoneColor : String = ""
    var phonePrice : Double = 0.0

    constructor (phoneType : String) : this() {
        this.phoneType = phoneType
    }
}
class Country (){
    var state : String = ""
    var town : String = ""
    var capital : String = ""
    var population: Long = 0
    var landmark : Double = 0.0

    constructor(town: String) : this() {
        this.town = town
    }
}
class Vehicle (){
    var carModel : String = ""
    var carPrice : Double = 0.0
    var carColor : String = ""
    var carNumber : String = ""
    var carOwner : String = ""

    constructor (carColor : String) : this() {
        this.carColor = carColor
    }

}
class Animal (){
    var gender : String = ""
    var age : String = ""
    var color : String = ""
    var species : String = ""
    var weight : String = ""

    constructor (weight : String) : this() {
        this.weight = weight
    }
}