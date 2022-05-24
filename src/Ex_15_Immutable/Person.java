package Ex_15_Immutable;

public class Person {
    private final String no;
    private final String name;
    private Address address;


    //default contructor
    public Person(String no, String name, Address address){
        this.no = no;
        this.name = name;
        this.address = address;
    }


    //getters
    public String getNo(){
        return no;
    }
    public String getName(){
        return name;
    }


    //setters and getters
    public void setAddress(Address address){
        this.address = address;
    }
    public Address getAddress(){
        Address newAddress = new Address(address);
        return newAddress;
    }

}