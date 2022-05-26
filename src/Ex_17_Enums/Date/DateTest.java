package Ex_17_Enums.Date;

import Ex_17_Enums.Date.dateConstant.DateConstant;
import Ex_17_Enums.Date.dateEnums.DayOfMonth;
import Ex_17_Enums.Date.dateEnums.Month;
import Ex_17_Enums.Date.dateEnums.Year;

import javax.xml.crypto.Data;


public class DateTest {
    public static void main(String[] args){

        // there is all given informations are impossible
        Date1 d1 = new Date1(-2, 25, 1232132132);
        Date2 d2 = new Date2("-2", "Ojak", "20022");


        // There we called enum from DateConstant class for Date1 class
        Date1 d3 = new Date1(DateConstant.DAY_1, DateConstant.MARCH, DateConstant.YEAR_2022);


        //There we called enum from DateEnums class for Date4 class
        Date4 d4 = new Date4(DayOfMonth.DAY_1, Month.MARCH, Year.YEAR_2022);

    }
}
