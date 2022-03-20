package entities

class EmployeeManagerImpl : EmployeeManager {

    private val employees = mutableListOf<Employee>()

    override fun addEmployee(employee: Employee) {
        employees.add(employee)
    }

    override fun printEmployees() {
        employees.forEach { employee -> println(employee) }
    }

    override fun getTotalSalary() : Double{
        return employees.map { employee -> employee.salary }.sum()
    }
}