package OOFP_Ch01_Ex2_superExample;

public class B extends A{
    int i = 9;

    @Override
    public void printI(){
        System.out.println("i variable in B class object: " + i);
        System.out.println("i variable in A class object: " + super.i);
    }

    @Override
    public void f(){
        System.out.println("f() method in B class object");
    }
}
