package Ex_14_SetGet;

public class WindowTest {







    public static int calculateWindowArea(Window window){
        return  window.getHeight() * window.getWidth();
    }

    public static void printWindowInfo(Window window){
        System.out.println("\nWindow Info");

        boolean open = window.isOpen();
        int width = window.getWidth();
        int height = window.getHeight();

        System.out.println("Window[open=" + open + ", width=" + width + ", height=" + height + "]");
    }






    public static void main(String[] args){

        //Window1
        Window window1 = new Window(true, 20, 15);
        window1.printInfo();

        window1.setOpen(false);
        System.out.println("Open? " + window1.isOpen());
        window1.printInfo();







        //Window2
        Window window2 = new Window();
        window2.setWidth(10);
        window2.setHeight(40);
        window2.close();

        window2.printInfo();
        System.out.println("Width : " + window2.getWidth());
        System.out.println("Height : " + window2.getHeight());

        printWindowInfo(window2);

    }




}
