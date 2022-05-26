package Ex_18.Enums.Size;

//
enum  Size {
    SMALL("S", 1), MEDIUM("M", 2), LARGE("L", 3), EXTRA_LARGE("XL", 4);

    private String abbreviation;
    private int no;

    private static String description;
    private static int count;


    static {
        System.out.println("in static initializer block");
        description = "These are sizes";
    }
    // for object
    {
        System.out.println("in object initializer block");
    }


    // due to enum
    Size(String abbreviation, int no){
        this.abbreviation = abbreviation;
        this.no = no;
    }




    //getters
    public String getAbbreviation() {
        return abbreviation;
    }

    public int getNo() {
        return no;
    }

    public static String getDescription() {
        return description;
    }
}
