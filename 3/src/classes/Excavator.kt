package classes

class Excavator(_name:String, _whoMade:String, _price:Int, _year:Int, _guarantee:Boolean, _model:String, _weight:Int,
                _capacity:Int):Mechanism(_name, _whoMade, _price, _year, _guarantee){
    var model = _model
    var weight = _weight
    var capacity = _capacity

    fun embarkation(cap:Int){
        if(weight > cap){
            println("Экскаватор не вмещается")
        }
        else{
            var res = cap-weight
            println("Экскаватор поместился. Количество свободных тонн: $res")
        }
    }

    fun work(count:Int){
        if((count > capacity) and (count % capacity == 0)){
            var res = count/capacity
            println("Количество подходов: $res")
        }
        else if((count > capacity) and (count % capacity != 0)){
            var res = count/capacity+1
            println("Количество подходов: $res")
        }
        else{
            println("Количество подходов: 1")
        }
    }

    fun Info(){
        println("Название: $name, \nПроизводитель: $whoMade, \nЦена: $price, \nГод выпуска: $year, \nМодель: $model, \nГарантия: $guarantee, \nВес: $weight, \nВместимость: $capacity ")
    }
}