package polymorphism;

public class MoneyGram implements MobileVerifiable{

    @Override
    public boolean verify() {
        System.out.println("Moner gram cancelling transaction");
        return false;
    }
}
