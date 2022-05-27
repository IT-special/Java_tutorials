package Ex_19_Polymorphism;
// 

public class TestPayrollOffice {
    public static void main(String[] args){



        //Standart
        PayrollOffice payrollOffice = new PayrollOffice();


        //For Employee
        //Standart connected employee with payrollOffice
        Employee e1 = new Employee(9966, "Ali Nuri", 1, "Computer Engineering" );
        payrollOffice.paySalary(e1); // Получается Employee employee = e1;


        System.out.println("*************");

        //For Manager
        Manager m1 = new Manager(8855, "Mustafa Yildirim", 2, "Software Engineering", "Computer Engineering");
        payrollOffice.paySalary(m1); // Получается Employee employee = m1;


        System.out.println("*************");


        //For Director
        Director d1 = new Director(22555, "Fatih Balki", 20, "Research Lab", "Software Engineering", 10000);
        payrollOffice.paySalary(d1); // Получается Employee employee = d1;


        System.out.println("*************");


        Employee emp = e1;
                 emp = m1;
                 emp = d1;



        // Data is created in inside Constructor
        payrollOffice.paySalary(new Employee(2255, "Harun Can", 1, "Computer Engineering"));
        System.out.println("*************");
        payrollOffice.paySalary(new Manager(6699, "Faris Mileva", 3, "Software Engineering"));
        System.out.println("*************");
        payrollOffice.paySalary(new Director(7744, "Tunahan", 20, "Project Development", "Software Engineering", 150000));
        System.out.println("*************");


        Engineer eng1 = new Engineer(1122, "Gokhan Bayram", 20, "Software Eng", "ATBYS");
        payrollOffice.paySalary(eng1);
    }
}
