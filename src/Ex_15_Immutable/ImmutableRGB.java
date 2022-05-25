package Ex_15_Immutable;

public class ImmutableRGB {

    final private int red;
    final private int green;
    final private int blue;
    final private String name;


    // Constructor
    public ImmutableRGB(int red, int green, int blue, String name) {
        //особый метод для теста
        check(red, green, blue);

        this.red = red;
        this.green = green;
        this.blue = blue;
        this.name = name;
    }








    private void check(int red, int green, int blue) {
        if (red < 0 || red > 255 || green > 255 || blue < 0 || blue > 250)
            throw new IllegalArgumentException();
    }

    private ImmutableRGB invert() {
        return new ImmutableRGB(255 - red, 255 - green, 255 - blue, "Inverse of" + name);
    }

    public int getRGB() {
        return ((red << 16) | (green << 8) | blue);
    }








    //getters
    public String getName() {
        return name;
    }

}