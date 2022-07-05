package OOFP_Ch01_Ex3_fruit;

public class FruitCollectionTest {
    public static void main(String[] args){
        FruitCollection collection = new FruitCollection();

        collection.add(new Apple());
        collection.add(new Banana());
        collection.add(new Melon());

        Object o = collection.get(0);
        Melon m = (Melon) o;
        m.cut();
        m.eat();

        o = collection.get(1);
        Banana b = (Banana) o;
        b.peel();
        b.eat();
    }
}
