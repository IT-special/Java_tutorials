package Ex_11_Bank;

public class CreditCard {
    String no;
    double balance;
    //
    Customer owner;


    // standart constuctor
    public CreditCard(String no, double balance){
        this.no = no;
        this.balance = balance;
    }

    //alternative best constructor
    public CreditCard(String no, double balance, Customer owner){
        this.no = no;
        this.balance = balance;

        // here we have to write
        this.owner = owner;
        owner.setCreditCard(this);
    }


    //setter
    public void setOwner(Customer owner){
        this.owner = owner;
    }
}