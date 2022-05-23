package Ex_11_Bank;

public class BankTest {
    public static void main(String[] args){


        Customer customer1 = new Customer(996471, "Alinuri");
        CreditCard creditCard1 = new CreditCard("6060 4377 445", 50000);
        //Standart Way for connection
        //
        // connection Customer => creditCard
        customer1.setCreditCard(creditCard1);
        creditCard1.setOwner(customer1);



        Customer customer2 = new Customer(99854, "Mustafa Yildirim");
        //Best Way for connection
        CreditCard creditCard2 = new CreditCard("8547 5554 124", 150_000_000, customer2);
    }
}
