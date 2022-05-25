package Ex_16_Incheritance.Filter2;

public class Director extends Manager {
    protected double bonus;

    public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus){
        super(no, name, year, workingDepartment, managingDepartment);
        this.bonus = bonus;
    }

    //added new method
    public void makeStrategicPlan(){
        System.out.println("Director makes a strategic plan for the company!");
    }
}