package OOFP_Ch01_Ex1_binding;

public class Child1 extends Parent{

    public static int i = 15;
    public int j = 19;

    // @Override //We can't override, because PRIVATE in Parent class
    public void doThis(){
        System.out.print("The object of Child1 is doing this!");
    }

    // @Override //We can't override, because STATIC in Parent class if we use of course by Parent, if directly
    public static void doIt(){
        System.out.println("The object of Child1 is doing it");
    }

    @Override
    public void make(){
        System.out.println("The object of Child1 is making something");
    }









    public static void main(String[] args){
        Parent p = new Child1();

        System.out.println("***********");
        p.doThat(); // Parent's doThat() is called!
        p.make(); // ChildStaticBinding's make() is called! Dynamic binding!

        Child1.doIt();
        Parent.doIt();
        p.doIt(); // From Parent Class
        doIt(); // From location Class
    }
}