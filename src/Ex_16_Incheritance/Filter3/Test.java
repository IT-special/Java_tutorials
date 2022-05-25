package Ex_16_Incheritance.Filter3;

public class Test {
    public static void main(String[] args) {




		Employee e1 = new Employee(1, "Ali", 3, "Production");
		e1.printInfo();
		System.out.println("Maaşı: " + e1.calculateSalary());
		e1.work();
        System.out.println();





		Manager m1 = new Manager(2, "Mustafa", 3, "Production", "Production");
		m1.printInfo();
		System.out.println("Maaşı: " + m1.calculateSalary());
		m1.work();
        m1.manage(); // Manager
        System.out.println();



        Director d1 = new Director(3, "Fatih", 3, "Management", "Management", 10000);
        d1.printInfo();
        System.out.println("Maaşı: " + d1.calculateSalary());
        d1.work();
        d1.manage(); //inside we have method makeStrategicPlan method
        //d1.makeStrategicPlan();
    }
}