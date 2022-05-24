package Ex_14_SetGet;

public class Window {

    private boolean open;
    private int width;
    private int height;




    // empty constructor
    public Window(){

    }
    //all include constructor
    public Window(boolean open, int width, int height) {
        this.open = open;
        this.width = width;
        this.height = height;
    }

    //setters and getters
    public boolean isOpen(){
        return open;
    }
    public void setOpen(boolean open){
        this.open = open;
    }

    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }






    //new method
    public void open(){
        open = true;
    }

    public void close(){
        open = false;
    }
    //
    public int calculateArea(){
        return height * height;
    }






    //print info
    public void printInfo(){
        System.out.println("Window[open=" + open + ", width=" + width + ", height=" + height + "]");
    }

}
