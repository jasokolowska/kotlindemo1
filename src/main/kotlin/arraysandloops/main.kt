package arraysandloops

/*Zadanie 3
Napisz funkcję, która przyjmuje trzy argumenty listę napisów, liczbę a typu Int, liczbę b typu Int
Funkcja powinna zwrócić kontatenację tych napisów z listy, których długość należy do przedziału <a, b>*/

fun concatenateAllStringsWithLengthFromAToB(words: List<String>, a: Int, b: Int): String {
    return words.filter { it -> it.length in (a+1) until (b+1) }.reduce{ acc, d -> acc + d }
}


/*Zadanie 2
Napisz funkcję, która przyjmuje jako argument tablice liczb całkowitych np. 150, -51, 24, 101, 105
i zwraca największą liczbę podzielną przez 5.
Dla podanego powyżej fragmentu, program powinien wypisać na ekranie 150
Jeśli funkcja otrzyma pustą tablicę, powinna zwrócić null*/

fun getMaxValueDividedByFive(array: Array<Int>): Int? {
    var value = Int.MIN_VALUE

    if (array.isEmpty()) {
        return null
    }

    for (v in array) {
        if (v > value && v % 5 == 0) {
            value = v
        }
    }
    return value
}


/*Napisz funkcję, która przyjmuje jako argument liczbę całkowitą i zwraca sumę jej cyfr.
Na przykład, dla liczby 4201, funkcja powinna zwrócić 7*/

fun getSumOfNumbers(arg: Int): Int {
    var n = Math.abs(arg)
    var sum = 0
    while (n > 0) {
        sum += n % 10
        n /= 10
    }
    return sum
}

fun numberOfZero(arg: Int): Int {
    var k = 0
    var n = arg
    while (n % 10 == 0) {
        n /= 10
        k++
    }
    return k
}

fun prepareSequence(n: Int): Array<String?> {
    val array = arrayOfNulls<String>(n)
    for (i in 0 until n) {
        array[i] = "word$i"
    }
    return array
}

fun main(args: Array<String>) {
//    println(numberOfZero(230000))

    println(getSumOfNumbers(4201))

    println(getSumOfNumbers(777))
    println(getSumOfNumbers(0))
    println(getSumOfNumbers(1002))
    println(getSumOfNumbers(-1002))


/*
    fun f() {
        fun g() {

        }
    }
*/

    if (!args.isEmpty()) {
        println(args[0])
    }

    for (i in 10..20) {
        print("$i ")
    }

    println();
    for (i in 10 downTo 2 step 2) {
        print("$i ")
    }

    val array1 = arrayOf(12, 31, 14, 51, 16, 71) //zwraca nam immutable array
    var sum = 0
    for (v in array1) {
        sum += v
    }
    println(sum)

//    println(prepareSequence(20))

    for (v in prepareSequence(20)) {
        println(v + " ")
    }

    println(getMaxValueDividedByFive(arrayOf(150, -51, 24, 101, 105)))
    println(getMaxValueDividedByFive(arrayOf()))
    println(getMaxValueDividedByFive(arrayOf(-150, -51, -5, -24, -101, -105, -2000)))

    var immutableList = listOf<String>("Anna", "Magda", "Kasia")
    println(immutableList)

    var mmutableList = mutableListOf<String>("Anna", "Magda", "Kasia")
    mmutableList.add("Piotr")

    println(mmutableList)

    val resultList = mmutableList.filter { it -> it.length > 4 }.map { it -> it.reversed() }

    println(resultList)

    val numbers = IntArray(20){3 * it}
    numbers.forEach { it -> print("$it ") }


    fun sumValuesLess0(nums: List<Double>):Double {
        return nums.filter { it -> it < 0 }.reduce{acc, d -> acc + d }
    }

    println(sumValuesLess0(listOf(-1.0, -2.0, -3.0)))
    println(concatenateAllStringsWithLengthFromAToB(listOf("a", "cd", "efg", "ijklm"), 1,2))

}