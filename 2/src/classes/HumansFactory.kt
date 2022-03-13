package classes
import kotlin.random.Random

class HumansFactory() : Human() {

    var humans = mutableListOf<String>()

    fun factory(min: Int, max: Int) {
        val r = Random.nextInt(min, max)
        for (i in 1..r) {
            val human = newHuman();
            humans.add(human);
        }
    }

    fun humanGo() {
        for (h in humans) {
            println(h)
        }
    }
}