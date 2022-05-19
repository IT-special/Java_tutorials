package Ex_4_Score;


/* Please Run this program inside Netbeans followin RUN - > Run Configurations -> Arguments section */
public class Main {
    public static void main(String[] args){
        String testscore = args[0]; // array
        int score = Integer.parseInt(testscore);

        char grade;
        if (score >= 90 ) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >=60) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is " + grade);

        if (grade == 'A' || grade == 'B'){
            System.out.println("\uD83D\uDC4F");
        }


    }
}
