package Ex_10_This_keyword;

public class Thistree {
    String type;
    int height;



    //Constructor
    public Thistree(String type, int height){
        this.type = type;
        this.height = height;
    }



    //Beautiful constructor
    public void printType(){
        System.out.println("Type: " + this.type);
    }
    public void printHeight(){
        System.out.println("Height: " + this.height);
    }
    public void printInfo(){
        System.out.println("Tree Information");
        this.printType();
        this.printHeight();
    }



    //getters and setters
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }



    public void setHeight(int Height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }



    //Main method
    public static void main(String[] args){
        Thistree tree = new Thistree("Cinar", 50);
        tree.printInfo();
    }
}
