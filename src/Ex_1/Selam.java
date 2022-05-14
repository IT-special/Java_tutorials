package Ex_1;

public class Selam {
    String world = "millet";

    public String selamSoyle(String kime){
        String cumle;
        if (kime != " ")
            cumle = "Ex_1.Selam "+kime+" :)";
        else
            cumle = "Ex_1.Selam "+world+" :)";
        return cumle;


    }
}
