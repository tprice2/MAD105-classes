/*Pseudocode
Variables:
employee1, employee3, employee3

Process:
The employee class was created with the arguments employeeName, employeeNumber, and shift.
The method display() is called for each entry to print the parameters.

 */

//This is the main function
fun main() {
    //These variables are added the the employee class with the given parameters.
    val employee1 = Employee("Bob", 123,1)
    val employee2 = Employee("Jorge", 213,2)
    val employee3 = Employee("Steve", 315,2)

    //The method in the employee class for printing the values is shown below:
    employee1.display()
    println("\n")
    employee2.display()
    println("\n")
    employee3.display()
}