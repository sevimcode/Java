package polymorphism;

public class Paypal extends PaymentMethod{


    @Override
    public void charge( double amount ) {
        System.out.println("\nAmount charged in Paypal :" + amount);
        System.out.println("Fee applied : $3");
    }

    @Override
    public void refund( double amount ) {
        System.out.println("Amount charged in Paypal" + amount);
    }
}
