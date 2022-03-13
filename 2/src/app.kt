import classes.HumansFactory
import classes.Human as Human

fun main(){
    val humans = HumansFactory()
    print("min: ")
    val min: Int = (readLine()!!).toInt()
    print("max: ")
    val max: Int = (readLine()!!).toInt()
    humans.factory(min,max)

    humans.humanGo()
}
