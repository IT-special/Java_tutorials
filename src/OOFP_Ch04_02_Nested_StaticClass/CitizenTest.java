package OOFP_Ch04_02_Nested_StaticClass;

import java.sql.SQLOutput;

public class CitizenTest {
    public static void main(String[] args) {
        Citizen.Nationality nationality1 = new Citizen.Nationality("Turkey", "TC");
        Citizen citizen1 = new Citizen("123456789", "Mustafa", "Yildirim", nationality1);

        System.out.println();
        System.out.println(citizen1);


        Citizen.Nationality nationality2 = new Citizen.Nationality("United States", "US");
        Citizen citizen2 = new Citizen("4324233453", "John", "Teller", nationality2);

        System.out.println();
        System.out.println(citizen2);
    }
}
