package classesandinterfaces

import entities.*

class A

fun main() {
    val p1 = Point3D(-0.2, 3.1,5.9)
    val p2 = Point3D(-0.2, 3.1,5.9)
    println(p1.equals(p2))

    Customer("Kasia", nationality = "Spanish").logData()

    val box1 = Box("test", 11)

//    Motorcycle("Suzuki", 250).printBrand()

    val vehicles: List<Vehicle> = listOf(Motorcycle("Suzuki", 250), Car("Volvo", 220))

    val player1 = Player("Ala", true)
    val player2 = Player("Ala", true)

    println(player1.equals(player2))
    println(player1)

    val e1 = Employee(123L, "address1", 10000.00, Position.MANAGER)
    val e2 = Employee(123L, "address2", 15000.00)
    val e3 = Employee(123L, "address3", 5000.00, Position.TESTER)
    val e4 = Employee(123L, "address4", 1000.00, Position.TESTER)

    var manager = EmployeeManagerImpl()
    manager.addEmployee(e1)
    manager.addEmployee(e2)
    manager.addEmployee(e3)
    manager.addEmployee(e4)

    manager.printEmployees()
    println(manager.getTotalSalary())

}

fun solution(A: IntArray, K: Int): IntArray {
    fun moveByOne(I: IntArray): IntArray {
//        var array =
        return IntArray(0)
    }
    return IntArray(0)
}
