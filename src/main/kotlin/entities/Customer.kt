package entities

//primary constructor
class Customer constructor(
    val firstName: String,
    val phoneNumber: String? = null,
    val nationality: String = "Polish"
) {
    fun logData() {
        println(firstName + " " + (if(phoneNumber == null) "with no phone nbr " else phoneNumber) + " " + nationality)
    }
}