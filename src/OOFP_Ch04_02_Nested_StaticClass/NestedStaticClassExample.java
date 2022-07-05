package OOFP_Ch04_02_Nested_StaticClass;

import OOFP_Ch04_01_NestedClasses.NestedClassesExample;
import jdk.dynalink.beans.StaticClass;

public class NestedStaticClassExample {
    private int i;
    private static int k = 9;

    public NestedStaticClassExample(int i){
        this.i = i;
    }

    public static class StaticClass{
        public StaticClass(){
            System.out.println("in StaticClass");
        }

        public void aMethod(int j){
            System.out.println("in aMethod() and j: " + j + " and k: " + k);

            NestedStaticClassExample o = new NestedStaticClassExample(21);
            System.out.println(o.i);
        }
    }

    public static void main(String[] args) {
        NestedStaticClassExample.StaticClass o1 = new NestedStaticClassExample.StaticClass();
        o1.aMethod(10);
    }


}
