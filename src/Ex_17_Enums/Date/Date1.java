package Ex_17_Enums.Date;

public class Date1 {

    private int dayOfMonth;
    private int month;
    private  int year;

    //default standart constuctor with addition if statement
    // (Нурик всегда помни когда создаешь конструктор -- > public)
    public Date1(int dayOfMonth, int month, int year){
        this.dayOfMonth = dayOfMonth;
        this.month = month;
        this.year = year;



        // we can add also some statements
        if(dayOfMonth < 0 | dayOfMonth > 31)
            System.out.println("Day of month: " + dayOfMonth);
    }
}
