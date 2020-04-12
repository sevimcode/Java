package polymorphism;

public class ZelleTransfer implements MobileVerifiable{
    @Override
    public boolean verify() {
        System.out.println("Zelle verifying the transfer");
        return true;
    }
}
