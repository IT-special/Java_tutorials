package OOFP_Ex_1_binding;

public class Child2 extends Parent{
    public static int i = 25;
    public int j= 29;

    // @Override //We can't override, because PRIVATE in Parent class
    public void doThis(){
        System.out.print("The object of Child2 is doing this!");
    }

    // @Override //We can't override, because STATIC in Parent class
    public static void doIt(){
        System.out.println("The object of Child2 is doing it");
    }

    @Override
    public void make(){
        System.out.println("The object of Child2 is making something");
    }

}
