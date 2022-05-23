package Ex_10_This_keyword;

public class Tree {
    String type;
    int height;

    //Constructor
    public Tree(String type, int height){
        this.type = type;
        this.height = height;
    }





    //?????
    //Ne ponyal Nurik
    public Tree copy(){
        Tree copyTree = new Tree(type, height);
        return copyTree;
    }
    //Ne ponyal Nurik
    public Tree grow(){
        height++; //height = height + 2; post increment
        return this;
    }






    //print
    public void printInfo(){
        System.out.println("Information about Tree");
        System.out.println("Type: " + type + " " + "Height " + height);
    }





    public static void main(String[] args) {
        Tree tree = new Tree("Cinar", 50);
        tree.printInfo();




        //we copied from above tree object
        Tree copytree = tree.copy();
        copytree.printInfo();


        //checking for same or not
        if (tree == copytree)
            System.out.println("The Same");
        else
            System.out.println("Different");




        System.out.println("**************");

        // very good
        tree.grow().grow().grow().printInfo(); // three times grow method implemented and print info







        // growTree ---> to this         Tree tree = new Tree("Cinar", 50);
        Tree growTree = tree.grow();
        growTree.printInfo();

        System.out.println();



        if(tree == growTree)
            System.out.println("The same");
        else
            System.out.println("Different");



    }


}
