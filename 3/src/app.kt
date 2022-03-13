import classes.Mechanism
import classes.Excavator

fun main(){
    var ex:Excavator = Excavator("КАМАЗ", "Россия", 300000, 2011, false, "212441", 20, 50)

    ex.Info()
    ex.yearsInWork()
    ex.embarkation(24)
    ex.work(19)
}
