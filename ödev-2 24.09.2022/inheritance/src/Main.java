public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee = new Employee();

        customer.firstName = "Tuğran" ;
        employee.age = 25 ;

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        customerManager.Add();
        employeeManager.BestEmployee();

    }
}