public class Selam {
    String word = "millet";

    public String selamSoyle(String kime){
        String cumle;
        if (kime != "")
            cumle = "Selam "+kime+" :)";
        else
            cumle = "Selam "+word+" :)";
        return cumle;
    }
}
