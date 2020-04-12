package objectscreating;

public class Account{

    public static void main(String[] args){

        BankAccount user1 = new BankAccount();
        user1.type = "Business";
        user1.holderName="Barack Obama";
        user1.accountNumber = 555555;
        user1.balance= 5000;

        user1.deposit(500);

        user1.transfer(1000);

        user1.info();


    }


}
