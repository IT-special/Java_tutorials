package OOFP_Ch01_Ex3_fruit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FruitCollection {
    private List<Fruit> list = new ArrayList<>();

    public static Collection create() {
        return new ArrayList();
    }

    public void add(Fruit fruit){
        list.add(fruit);
    }

    public Object get(int index){
        return list.get(index);
    }
}