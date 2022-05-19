package Ex_6_Car_OOP;

public class Main {
    public static void main(String[] args) {

        // We Created here Lexus object in class Car
        Car lexus = new Car();

        // So lets Modeling our Lexus
        lexus.brand = "Lexus";
        lexus.build_of_years = "2004";
        lexus.model = "GS 300";
        lexus.speed = 220;
        lexus.distance = 130_000;
        // call getInfo method from Car class
        System.out.println(lexus.getInfo());

        /* ******************************  */

        Person alinuri = new Person();

        alinuri.kimlikNo = "99647155242";
        alinuri.firstName = "Ali Nuri";
        alinuri.lastName = "Amantay";

        System.out.println(alinuri.getInfo());

        //Until this section both Person and Car does not have any relation between them.
        /* So Let's create bi-directional, 1-1 association */

        lexus.owner = alinuri; //   inside Person class => Car vehicle;
        alinuri.vehicle = lexus; // inside Car class    => Person owner;

        // Let's change some properties
        lexus.speed = 240;
        lexus.go(20);

        System.out.println(lexus.getInfo());
        System.out.println(alinuri.getInfo());
    }
}
