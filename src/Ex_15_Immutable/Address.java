package Ex_15_Immutable;

import java.util.Collections;
import java.util.List;

public class Address {

    private final String name;
    private final String city;
    private final String state;
    private final String zip;

    private final List<String> streets;

    /* Created by Idea by default but without List<String> streets */

//    public Address(String name, String city, String state, String zip) {
//        this.name = name;
//        this.city = city;
//        this.state = state;
//        this.zip = zip;
//    }


    public Address(String name, String city, String state, String zip, List<String> streets){
        this.name = name;
        this.city = city;
        this.state = state;
        this.zip = zip;

        this.streets = streets;
    }

    public Address(Address address){
        this.name = address.name;
        this.city = address.city;
        this.state = address.state;
        this.zip = address.zip;

        this.streets = address.streets;
    }


    //getters
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getZip(){
        return zip;
    }
    // неизменяемый лист мы тут прописали
    public List<String> getStreets(){
        return Collections.unmodifiableList(streets); //неизменяемый лист и тут мы импортировали Коллекцию
    }
}