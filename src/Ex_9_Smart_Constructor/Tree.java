package Ex_9_Smart_Constructor;

public class Tree {
    String type;
    int height;

    //this is smart constructor
    public Tree(String new_type, int new_height){
        type = new_type;
        height = new_height;
    }
    //

    public void printInfo(){
        System.out.println("Tree type: " + type + " " + "Tree height: " + height);
    }

    public static void main(String[] args){
        Tree tree = new Tree("OAK", 50);
        tree.printInfo();
    }
}
