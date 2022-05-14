package Ex_2;

public class Car {
    // Cars Properties
    public String brand;
    public String model;
    public String years_of_built;

    public int distance;
    public int speed;

    public double go(int newDistance){
        distance = distance + newDistance; // We can also write like distance+=newDistance

        double period = (double )newDistance / speed;
        return period;
    }

    public void accelerate(int newSpeed){
        speed = newSpeed; // We can also write this.speed = newSpeed;
    }

    public void stop(){
        speed = 0;
    }

    public String getInfo(){
        String info = "Car info: " + brand + " " + model + " " + years_of_built + " " + "Distance: " + distance + "km" + " " + speed + "km/h";
        return info;
    }


}
