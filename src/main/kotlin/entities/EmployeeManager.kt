package entities

interface EmployeeManager {

    fun addEmployee(employee: Employee)
    fun printEmployees()
    fun getTotalSalary(): Double
}