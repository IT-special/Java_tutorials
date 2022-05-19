package Ex_6_Car_OOP;

public class Person {
    String kimlikNo;
    String firstName;
    String lastName;

    Car vehicle;

    public String getInfo() {
        String info = "Person info: " + kimlikNo + " " + "First Name " + firstName + " " +
                "LastName: " + lastName;

        if (vehicle != null)
            info += " and has a car: " + vehicle.getInfo();
        else
            info += " and has no car.";
        return info;
    }
}
