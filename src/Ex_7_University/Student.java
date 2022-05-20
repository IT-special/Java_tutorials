package Ex_7_University;

// Akin isimli ogrenci Computer Science departmaninda, java dersini almaktadir -> Ayse isimli hocadan
public class Student {
    String no;
    String name;
    String dob; //date_of_birth

    Department department;
    Professor advisor; // Ogrencinin yardimci advisor Professor hocasi vardir.
    Course[] coursesTaken;
}