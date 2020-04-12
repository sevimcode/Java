package polymorphism;

public class CreditCard extends PaymentMethod{


    @Override
    public void charge( double amount ) {
        System.out.println("\nAmount charged from credit card : " + amount);
        System.out.println("Fee applied : $3");
    }

    @Override
    public void refund( double amount ) {
        System.out.println("Amount refunded from credit card" + amount);
    }
}
