package Ex_19_Polymorphism;

public class PayrollOffice {



    // Нурик тут интересный метод
    public void paySalary(Employee employee){

        double salary = employee.calculateSalary(); // Берет метод calculateSalary() c Employee
        System.out.println("Paying a salary of " + salary + " to " + employee.getName()); // Берет метод getName() c Employee
    }
}
