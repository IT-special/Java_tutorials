package Ex_7_University;

public class Professor {
    String no;
    String name;
    String dob; // date_of_birth
    String rank; //Ass.Prof, Docent , etc..

    Department department; //1 Professorun 1 departmani var
    Student[] advisee; // Kendisine advise yapan advisorlari(yardimci oldugu) vardir
    Course[] coursesGiven; // Professorun verdigi dersler var
}
