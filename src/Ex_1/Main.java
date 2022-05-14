package Ex_1;

public class Main {
    public static void main(String[] args) {
        Selam nesne = new Selam();
        String cevap = nesne.selamSoyle("Ali");
        System.out.println(cevap);

        int i=10;
        System.out.println(i);

        cevap = nesne.selamSoyle("Mehmet");
        System.out.println(cevap);

        System.out.println("World: "+nesne.world);
    }
}