package Ex_11_Bank;

public class Customer {
    int id;
    String name;
    // connection with Credit Card
    CreditCard creditCard;





    //standart constuctor
    public Customer(int id, String name){
        this.id = id;
        this.name = name;
    }






    //setter
    public void setCreditCard(CreditCard creditCard){
        this.creditCard = creditCard;
    }
}
