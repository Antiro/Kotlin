package classes

open class Mechanism constructor(_name:String, _whoMade:String, _price:Int, _year:Int, _guarantee:Boolean){
    var name = _name
    var whoMade = _whoMade
    var price = _price
    var year = _year
    var guarantee = _guarantee


    fun yearsInWork(){
        var res = 2022 - year
        println("Проработал $res лет(год)")
    }
}