package Ex_7_University;

public class Main {
    public static void main(String[] args){
        Professor professor1 = new Professor();
        professor1.name = "Rifat Yazici";

        Course course1 = new Course();
        course1.name = "RFID";

        Student student1 = new Student();
        student1.name = "Ali Nuri";

        Department department1 = new Department();
        department1.name = "Bilgisayar Muhendisligi";

        // Departman basinda professor 1    =>  Department <-> Professor
        department1.head = professor1;
        professor1.department = department1;


        //Rfid dersinin departmani Bilgisayar Muh.
        course1.department = department1;
        // чтобы связть связь, так как Course is Array type, first we have to initialize after declare
        department1.courses = new Course[100]; // first initialized (Departmanda 100 tane ders aciliyormus)
        department1.courses[0] = course1; // 0. ders course 1 = > Rfid dersi

        course1.teacher = professor1; // rfid dersinin hocasi vardir oda Rifat hocadir.
        professor1.coursesGiven = new Course[5]; // Professorun verdigi ders eger 5 ise (hepsinin default degerleri => null'dir) ---> Rifat Hocanin verdigi dersler ornegin [rfid, bilg_mimarisi, ..]
        professor1.coursesGiven[0] = course1;

        //State management -> iki sinif arasinda baglanti kuruldugu zaman ikisinde baglanti kurmamiz lazim
        professor1.advisee = new Student[10]; // Rifat hocanin 10 tane yardimci ogrencileri vardir.
        professor1.advisee[0] = student1; // Rifat hocanin yardimcisi Ali Nuri
        student1.advisor = professor1; // Ali Nuri nin yardimci hocasi Rifat hoca


        student1.coursesTaken = new Course[7]; //Student 7 tane ders alabilir
        student1.coursesTaken[0] = course1;

        course1.students = new Student[100]; //bu kursu 100 tane ogrenci alabilir.
        course1.students[0] = student1;

        System.out.println(student1.name + "'s" + " first course is " + student1.coursesTaken[0].name); // Ali Nurinin aldigi derslerin ilki adi nedir?
        System.out.println(student1.name + "'s" + " first course's professor is " + student1.coursesTaken[0].teacher.name);
        System.out.println(student1.name + "'s" + " first course's professor's department is " + student1.coursesTaken[0].teacher.department.name);


    }
}
