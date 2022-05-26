package Ex_17_Enums.Date;




// Нурик мы тут импортировали пакеты
// так как вызываем объектный тип для перемен
// все объекты are enum
import Ex_17_Enums.Date.dateEnums.DayOfMonth;
import Ex_17_Enums.Date.dateEnums.Year;
import Ex_17_Enums.Date.dateEnums.Month;
//








public class Date4 {
    private DayOfMonth dayOfMonth;
    private Month month;
    private Year year;






    //standart constructor
    public Date4(DayOfMonth dayOfMonth, Month month, Year year){
        this.dayOfMonth = dayOfMonth;
        this.month = month;
        this.year = year;
    }





    //standart getters and setters
    public DayOfMonth getDayOfMonth() {
        return dayOfMonth;
    }
    public void setDayOfMonth(DayOfMonth dayOfMonth){
        this.dayOfMonth = dayOfMonth;
    }

    public Month getMonthmonth() {
        return month;
    }
    public void setMonth(Month month){
        this.month = month;
    }

    public Year getYear() {
        return year;
    }
    public void setYear(Year year){
        this.year = year;
    }
}