package OOFP_Ch04_03_Nested_MemberClass;

public class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car.Make make1 = car1.new Make("Mercedes", "c180", "2017");
        car1.setMake(make1);

        System.out.println(car1);

        Car car2 = new Car();
        Car.Make make2 = car2.new Make("BMW", "M3", "2016");
        car2.setMake(make2);
        car2.accelerate(120);
        car2.go(100);
        car2.go(40);

        System.out.println(car2);

        Car.Make carMake = car2.getMake();
        System.out.println(carMake);

    }


}
