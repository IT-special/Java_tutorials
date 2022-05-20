package Ex_8_Calculator;

public class Calculator {
    String name;

    //getter and setter
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }




    //methods
    void whoAreYou(){
        System.out.println("I am Calculator, my name is " + name);
    }




    //arithmetic functions
    public int add(int first, int second){
        return first + second;
    }

    public int substract(int first, int second){
        return first - second;
    }

    public int multiply(int first, int second){
        return first * second;
    }

    public int multiplyByAdding(int first, int second){
        int multiplication = 0;
        for(int i=1; i<=second; i++)
            multiplication += first;
        System.out.println("Multiplication: " + multiplication);
        return multiplication;
    }

//    public double divide(int fist, int second) {
//        return (double)first / second;
//    }

    public double divide(int first, int second) {
        return (double)first / second;
    }

    //main for Testing
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.setName("T-308");

        //
        calculator.whoAreYou();

        // Addition
        int i = calculator.add(12, 27);
        System.out.println("12+27=" + i);

        // Division
        double k = calculator.divide(12, 27);
        System.out.println("12/27=" + k);

        System.out.println(" 83-56="+calculator.substract(50,30));
        System.out.println(" 83-56="+calculator.multiply(8,5));


    }

}
