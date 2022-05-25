package Ex_16_Incheritance.Filter3;


import java.util.Base64;

// Нурик мы тут использовали Наследование
public class Manager extends Employee {
    protected String departmentManaged;








    //used for specially for manager for salary
    public static final int MANAGEMENT_PAYMENT = 3000;







    public Manager(int no, String name, int year, String workingDepartment, String departmentManaged){
        super(no, name, year, workingDepartment); // используется точно также как this.
        // переход произсодит от конструктора Employee
        this.departmentManaged = departmentManaged;
    }


    @Override
    public void work(){
        System.out.println("Manager is working");
    }

    public void manage(){
        System.out.println("Manager manages department: " + departmentManaged);
    }


    @Override
    public double calculateSalary(){
        return year * BASE_SALARY + MANAGEMENT_PAYMENT;
    }

    @Override
    public void printInfo(){
        System.out.println("\nNo: " + no);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Department: " + department);
        System.out.println("Managing Department: " + departmentManaged);
    }
}