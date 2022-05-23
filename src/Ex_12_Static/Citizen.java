package Ex_12_Static;

import java.util.Date;

public class Citizen {
    int id;
    String firstName;
    String lastName;
    String placeOfBirth;
    char cinsiyet;
    String fatherName;
    String motherName;
    Date dateOfBirth;



    public Citizen(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //declaration static variable
    static String nationality;
    //getter
    static String getNationality(){
        return nationality;
    }





    public static void main(String[] args){
        Citizen citizen1 = new Citizen(52, "AliNuri", "Amantay");
        Citizen citizen2 = new Citizen(43, "Mustafa", "Yildirim");

        // мы тут обращаемся к КЛАССУ, все объекты теперь будут ссылаться на статический..
        Citizen.nationality = "T.C";

        System.out.println("Nationality " + Citizen.nationality);
        System.out.println("Nationality of AliNuri " + citizen1.nationality);
        System.out.println("Nationality of Mehmet" + citizen2.nationality);


        Citizen.nationality = "USA";
        citizen1.nationality = "USA";
        citizen1.nationality = "USA";


        //можно так вывести на экран
        System.out.println("\nNationality " + Citizen.nationality);
        System.out.println("Nationality of AliNuri " + citizen1.nationality);
        System.out.println("Nationality of Mehmet" + citizen2.nationality);
        //можно и так вывести на экран (правильно использовать так)
        System.out.println("\nNationality" + Citizen.getNationality());
        System.out.println("Nationality of AliNuri " + citizen1.getNationality());
        System.out.println("Nationality of Mehmet" + citizen2.getNationality());
    }



}
