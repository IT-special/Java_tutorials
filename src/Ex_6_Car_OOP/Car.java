package Ex_6_Car_OOP;

public class Car {
    // Instances of Car
    String brand;
    String model;
    String build_of_years;
    int speed;
    int distance;

    // OOP *************************************************
    Person owner; // Person have some informations in Person Class

    //Methods for CAR
    public void go(int newDistance){
        distance = distance + newDistance;
    }

    public void accelerate(int newSpeed){
        speed = newSpeed;
    }

    public void stop(){
        speed = 0;
    }

    public String getInfo(){
        String info = "Car Info: " + build_of_years + " " + brand + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
        if(owner != null)
            info += " And its owner is " + owner.firstName + " " + owner.lastName;
        else
            info += " And it does not have an owner!";
        return info; // Нурик для себя нот, если метод вызывает тип Стринг то в конце должно быть return
    }
}