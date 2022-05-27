package Ex_19_Polymorphism;

// Extends Employee
public class Engineer extends Employee{
    private String project;

    public Engineer(int no, String name, int year, String department, String project){
        super(no, name, year, department);
        this.project = project;
    }

    public void work(){
        System.out.println("Engineer is working on a project: " + project);
        assignTask("To Do: Very Important Task");
    }

    public void assignTask(String task){
        System.out.println("Engineer " + name + " works on the task: " + task);
    }
}
