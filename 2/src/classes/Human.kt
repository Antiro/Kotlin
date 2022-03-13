package classes
import kotlin.random.Random

open class Human {
    var name: String = "undefined"
    var age: Int = 0
    var mana: Boolean = false

    fun newHuman():String {
        val names = arrayOf("Антон", "Олег", "Максим", "Павел", "Ира", "Вера", "Катя", "Елена");
        name = names[Random.nextInt(0, 7)]
        age = Random.nextInt(2, 95)
        mana = Random.nextBoolean()
        return "Name: $name Age:$age Mana: $mana"
    }
}