package Ex_17_Enums.Date;

public class Date2 {

    // difference between Date1 class is Type declaration for variables
    // in Date 1 we declared as int

    private String dayOfMonth;
    private String month;
    private  String year;


    //default standart constuctor
    // (Нурик всегда помни когда создаешь конструктор -- > public)
    public Date2(String dayOfMonth, String month, String year){
        this.dayOfMonth = dayOfMonth;
        this.month = month;
        this.year = year;
    }
}