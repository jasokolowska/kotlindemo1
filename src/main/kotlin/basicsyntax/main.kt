package basicsyntax

import kotlin.math.PI

fun main() {
    //typy, var i val

    var number : Int = 1
//    var number = 1
    print(number)

    val name = "Ala" //immutable

    val result = 25 * 102

    println(result)

    var value : Double = 28.0
    value *= PI
    println(String.format("%.4f", value))
    println(value.div(2.0).plus(0.03))

    val num2 = -0.000122f
    var x = 10.01f
    var y = 0.0
    y = x.toDouble()
    val num3 = 1_000_000

    if(num3 is Number) {
        println("$num3 is number")
    }

    val v1 = 'A'
    val v2 = 'B'

    println("v1 hashcode = ${v1.hashCode()} v2 hashcode = ${v2.hashCode()}")
    println(v1 === v2) //za pomoca === porownujemy referencje
    println(v1 == v2) //za pomoca == porownuje sie wartosci (a w javie referencje)
    println(v1.equals(v2))
    println(v1.compareTo(v2))

    //String, Int, Double, Char, Float
    var num5 = -99.99
    var num6 = -99.99 //ze wzgledow optymalizacyjnych nie powstanie kopia wartosci, ktora juz istnieje w pamieci,
    // tylko num6 bedzie referencją na wartosc na ktora referuje num5
    println(num5 === num6)

    var v3 = "abc"
    var v4 = "abc"
    println(v3 !== v4)

    v4 += "" //powstaje nowy obiekt

    println(v3 !== v4)

    val result2 = (true || 2 < 1) && ("word".length == 5) && (false != !true)

    var cityName : String = "Kraków"
    println(cityName[cityName.length - 1])

    var xy = "getInstance()"
//    xy = null // w Kotlinie domyslnie ze wzgledów bezpieczenstwa nie mog epodstawic null

    var lastName : String? = "Bartnicki" //? pozwala podstawic null
    lastName = null

    println(lastName?.length) //program dalej działa, nie poleci wyjatek
    println("hello")

    //dzieki "!!" jesli lastName bedzie null to poleci wyjatek:

    lastName!!

    //KONWENCJE KODOWANIA - STANDARD DLA WSZYSTKICH



















}