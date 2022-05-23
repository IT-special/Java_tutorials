package Ex_9_Smart_Constructor;

public class Overloaded_Tree {
    String type;
    int height;

    //there are smart constructors
    public Overloaded_Tree(String new_type, int new_height){
        type = new_type;
        height = new_height;
    }

    public Overloaded_Tree(String new_type){
        type = new_type;
    }

    public Overloaded_Tree(int new_height){
        height = new_height;
    }

    public Overloaded_Tree(){

    }
    //

    public void printInfo(){
        System.out.println("Tree type: " + type + " " + "Tree height: " + height);
    }

    public static void main(String[] args){
        Overloaded_Tree tree = new Overloaded_Tree("OAK", 50);
        tree.printInfo();

        Overloaded_Tree tree2 = new Overloaded_Tree("Cinar");
        tree2.printInfo();

        Overloaded_Tree tree3 = new Overloaded_Tree(60);
        tree3.printInfo();

        Overloaded_Tree tree4 = new Overloaded_Tree();
        tree4.printInfo();
    }
}
