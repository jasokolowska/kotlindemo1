package entities

data class Employee constructor(val id: Long,
                                var address: String,
                                var salary: Double,
                                var position: Position? = Position.DEVELOPER) {

}

enum class Position {
    MANAGER, DEVELOPER, TESTER
}
