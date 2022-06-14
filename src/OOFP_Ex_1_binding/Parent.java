package OOFP_Ex_1_binding;

public class Parent {
    public static int i = 5;
    public int j = 9;

    /* Normal Method */
    private void doThis(){
        System.out.println("The object of Parent doing this");
    }

    /* Final Method */
    public final void doThat(){
        System.out.println("The object of Parent is doing that");
    }

    /* Static Method */
    public static void doIt(){
        System.out.println("The object of Parent is doing it");
    }

    /* Protected method */
    protected void make(){
        System.out.println("The object of Parent is making something");
    }









    public static void main(String[] args){
        Parent p = new Parent();
        System.out.println(p.i);

        p.doThis();
        p.doThat();

        Parent.doIt(); /* Because method type is STATIC :)*/
        p.doIt();

        p.make();
    }







}
