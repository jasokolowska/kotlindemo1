package controlstatements

fun main() {
    /*val stringInput = readLine()!!
    println(stringInput)
    val inputStringSize = stringInput.length
    val result = if(inputStringSize % 2 == 0) inputStringSize +1 else inputStringSize + 2
    println(result)*/

    //when
    val temperature = 60

    when {
        temperature < 10 -> println("Low")
        temperature in 10 .. 20 -> println("Medium") //obustronnie domkniety
        temperature > 20 -> println("High")
    }

    val name = "Marysia"
    var invited : Boolean?

    when(name) {
        "Kasia" -> invited = true
        "Basia" -> invited = false
        "Marysia" -> invited = true
        else -> invited = null
    }

    println(invited)

    val num : Int = 2
    val res = when(num) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        else -> "unknown"
    }
    //when tez czesto sluzy do obslugi wyjatkow
    println(res)

}