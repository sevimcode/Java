package polymorphism;

public class PaymentMethod implements MobileVerifiable{  // it is passing the implementation to the child classes creditcard bankaccount and paypal
    public void charge(double amount){
        System.out.println("Amount charged " + amount);

    }

    public void refund(double amount){
        System.out.println("Amount refunded " + amount);

    }

    @Override
    public boolean verify() {
        System.out.println("Please approve ");
        return true;
    }
}
