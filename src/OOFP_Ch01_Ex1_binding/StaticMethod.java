package OOFP_Ch01_Ex1_binding;

public class StaticMethod {
    public static void main(String[] args) {
        Parent p = new Child1();
        p.doIt(); //Parent
        p.make(); //Child1

        System.out.println("***");
        p = new Child2();
        p.doIt(); //Parent
        p.make(); //Child2

        System.out.println("*****");
        Child1 ch1 = new Child1();
        ch1.doIt();

        Child2 ch2 = new Child2();
        ch2.doIt();

        System.out.println("*****");
        System.out.println(Parent.i);
        System.out.println(p.j);

        System.out.println(Child1.i);
        System.out.println(ch1.j);

        System.out.println(Child2.i);
        System.out.println(ch2.j);

    }
}
