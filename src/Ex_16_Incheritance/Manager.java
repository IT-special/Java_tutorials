package Ex_16_Incheritance;





// Нурик мы тут использовали Наследование
public class Manager extends Employee{
    protected String departmentManaged;

    public static final int MANAGEMENT_PAYMENT = 5000;

    public Manager(int no, String name, int year, String workingDepartment, String departmentManaged){
        super(no, name, year, workingDepartment);
        this.departmentManaged = departmentManaged;
        System.out.println("in Manager()");
    }
}