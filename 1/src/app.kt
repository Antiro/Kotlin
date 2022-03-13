import com.sun.source.doctree.SummaryTree
import kotlin.random.Random
import java.util.*
import java.math.*
import kotlin.math.pow

fun main() {
//    В некоторой школе занятия начинаются в 9:00. Продолжительность урока —
//    45 минут, после 1-го, 3-го, 5-го и т.д. уроков перемена 5 минут, а после 2-го,
//    4-го, 6-го и т.д. — 15 минут. Дан номер урока (число от 1 до 10). Определите,
//    когда заканчивается указанный урок. Выведите два целых числа: время
//    окончания урока в часах и минутах.

//    print("Урок: ")
//    var les: Int = (readLine()!!).toInt()
//    if (les > 10) {
//        les = 10
//    }
//
//    var go:Int =540+les*45
//
//    for (i in 1..les) {
//        var p:Int
//        if (i%2==0 && i%les!=0){go+=15}
//        else if (i%2!=0 && i%les!=0){go+=5}
//    }
//    val H:Int = go/60
//    val M:Int = go%60
//    print("Окончание урока: $H:$M")


//    С начала суток прошло N минут. Выведите время, которое отображается на
//    электронных часах

//    var time: Int = (readLine()!!).toInt()
//    if (time>1439){time=1439}
//    val H=time/60
//    val M= time%60
//    print("${H}:${M} ($time минут)")


//    Шахматный король ходит по горизонтали, вертикали и диагонали, но только
//    на 1 клетку. Даны две различные клетки шахматной доски, определите,
//    может ли король попасть с первой клетки на вторую одним ходом. Программа
//    получает на вход четыре числа от 1 до 8 каждое, задающие номер столбца и
//    номер строки сначала для первой клетки, потом для второй клетки.
//    Программа должна вывести YES, если из первой клетки ходом короля можно
//    попасть во вторую или NO в противном случае.

//    print("x1: ")
//    val x1: Int = (readLine()!!).toInt()
//    print("y1: ")
//    val y1: Int = (readLine()!!).toInt()
//    print("x2: ")
//    val x2: Int = (readLine()!!).toInt()
//    print("y2: ")
//    val y2: Int = (readLine()!!).toInt()
//
//    if ((Math.abs(x1 - x2) <= 1) and (Math.abs(y1 - y2) <= 1)) {
//        print("да")
//    }
//    else{
//    print("нет")
//    }


//    Яша плавал в бассейне размером N × M метров и устал. В этот момент он
//    обнаружил, что находится на расстоянии x метров от одного из длинных
//    бортиков (не обязательно от ближайшего) и y метров от одного из коротких
//    бортиков. Какое минимальное расстояние должен проплыть Яша, чтобы
//    выбраться из бассейна на бортик? Программа получает на вход числа N, M,
//    x, y. Программа должна вывести число метров, которое нужно проплыть Яше
//    до бортика.

//    print("N: ")
//    var n: Int = (readLine()!!).toInt()
//    print("M: ")
//    var m: Int = (readLine()!!).toInt()
//    print("x: ")
//    var x: Int = (readLine()!!).toInt()
//    print("y: ")
//    var y: Int = (readLine()!!).toInt()
//
//    if (n > m) {
//        val t=n
//        n=m
//        m=t
//    }
//    if (y >= m / 2) {
//        y = m - y
//    }
//    if (x >= n / 2){
//        x = n - x
//    }
//    if (x < y) {
//        print(x)
//    }
//    else {
//        print(y)
//    }


//    По данному натуральному n вычислите сумму 13+23+33+...+n3

//    print("n: ")
//    val n: Int = (readLine()!!).toInt()
//
//     var sum:Double = 0.0
//    for ( i in 1 .. n) {
//        sum += i.toDouble().pow(3)
//    }
//    print(sum)


//    По данному натуральному числу N найдите наибольшую целую степень
//    двойки, не превосходящую N. Выведите показатель степени и саму степень.
//    Операцией возведения в степень пользоваться нельзя!

//    print("n: ")
//    val n: Int = (readLine()!!).toInt()
//    var a = 1
//    var b = 2
//
//    while (b <= n) {
//        b *= 2
//        a += 1
//    }
//    print("${a - 1}, ${b / 2}")

/////////////////////////////////////////////////////////////////////////////////////

//    val rand = Random.nextInt(0, 30)
//    val numbers = Array(rand, { i -> (Random.nextInt(1, 7)) })
//
//    for (number in numbers) {
//        print("$number \t")
//    }

//  1 задача
//    val count = numbers.groupingBy { it }.eachCount() //групировка массива
//    val max = count.maxByOrNull { it.value }?.key// полиск макс. значения
//    print("\nMax повторов: $max")

//  2 задача
//    val rep = numbers.groupingBy { it }.eachCount().filter { it.value > 1 }// групировка с фильтром
//    println("\nПовторок: $rep")


///////////////////////////////////////////////////////////////////////////////////////////
//    функция проверки на числа на простоту
//    fun prost(x: Int): Boolean {
//        if (x < 2) return false
//        for (m in 2..x - 1) {
//            if (x % m == 0) return false
//        }
//        return true
//    }
//
//    val s = 4;
//    print(prost(s));

//    используя функцию нахождения НОД двух чисел, сократить дробь
//    fun NOD(x: Int, y: Int): Int {
//        if (y == 0) return x;
//        return NOD(y, x % y);
//    }
//
//    print("x: ")
//    val x: Int = (readLine()!!).toInt()
//    print("y: ")
//    val y: Int = (readLine()!!).toInt()
//
//    val n = NOD(x, y)
//
//    println("${x / n}/${y / n}")

//    дан первый член и разность арифм. прогрессии
//    написать рекурсивную функцию
//    а) вычисления n-ого члена прогрессии
//    б) вычисления суммы n первых членов прогресии


    fun aref(m: Int, d: Int, n: Int): Int {
        var temp:Int = m
        if (n > 0) {
            temp = d+aref(temp,d,n-1)
        }

        if (n==1){
            temp -= d
        }
        return (temp)
    }

    fun sumAref(m: Int, d: Int, n: Int): Int {
        var temp=m
        var sum:Int=m
        for (i in 1 .. n)
        {
            sum+=temp
            temp+=d
        }
        return sum
    }

    print("m: ")
    val m: Int = (readLine()!!).toInt()
    print("d: ")
    val d: Int = (readLine()!!).toInt()
    print("n: ")
    val n: Int = (readLine()!!).toInt()

    print("N число: ${aref(m,d,n)}\n")
    print("Сумма чесел: ${sumAref(m,d,n)}")
}
