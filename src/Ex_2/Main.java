package Ex_2;

public class Main {
    public static void main(String[] args){
        //We there created new Car object Mercedes
        Car car1 = new Car();

        System.out.println("When car stand in first position");
        car1.brand = "Mercedes";
        car1.model = "CLK 200";
        car1.years_of_built = "2022";

        car1.distance = 0;
        car1.speed = 0;

        String info = car1.getInfo();
        System.out.println(info);

        System.out.println("When a car is accelerated");
        car1.accelerate(100);
        car1.go(20);
        car1.go(130);
        System.out.println(car1.getInfo());
        car1.stop();
        System.out.println(car1.getInfo());

        //We created new Car object BMw

        Car car2 = new Car();
        car2.model = "BMW";
        car2.brand = "i8";
        car2.years_of_built = "2022";

        car2.accelerate(160);
        car2.go(250);
        System.out.println(car2.getInfo());

        car2.accelerate(250);
        car2.go(300);
        System.out.println(car2.getInfo());
    }
}
