//This is the employee class, with arguments shown below:
class Employee (var employeeName: String, var employeeNumber: Int, var shift: Int)
{
    //This method of the employee class prints the parameters
    fun display(){
        println(employeeName + "\nNumber: " + employeeNumber.toString() +
                "\nShift: " + shift.toString())
    }
}