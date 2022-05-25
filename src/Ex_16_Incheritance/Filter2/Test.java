package Ex_16_Incheritance.Filter2;

public class Test {
    public static void main(String[] args) {




		Employee e1 = new Employee(1, "Ali", 3, "Production");
		e1.printInfo();
		System.out.println("Maaşı: " + e1.calculateSalary());
		e1.work();






		Manager m1 = new Manager(2, "Fatma", 3, "Production", "Production");
		m1.printInfo();
		System.out.println("Maaşı: " + m1.calculateSalary());
		m1.work();
		//added here
        m1.manage();





        //
        Director d1 = new Director(3, "Mehmet", 3, "Management", "Management", 10000);
        d1.printInfo();
        System.out.println("Maaşı: " + d1.calculateSalary());
        d1.work();
        //added here
        d1.manage();
        d1.makeStrategicPlan();
    }
}