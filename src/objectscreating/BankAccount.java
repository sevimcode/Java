//2. Create a class BankAccount
//Instance variables: type, accountNumber, balance,
//        holderName Methods:
//        deposit. Method accepts double and it doesn’t return anything.
//        Method should simply print “%double is deposited to your account”
//        and add given double to the balance.
//        transfer -> accepts double ->
//        Method should print “%double $ is transferred from your account”
//        and decrement balance by given amount.
//        info -> Method doesn’t accept or return anything.
//        It should simply print the information about the BankAccount as below format
//        Name: %holderName
//        Balace: %balance
//        Type: %type
//        Account Number: %accountNumber
//        Collapse


package objectscreating;

public class BankAccount{

   String holderName;
    String type;
    int accountNumber;
    double balance;

    public void deposit(double deposit){

        System.out.println(deposit+ "is deposited to your account");
        this.balance += deposit;
    }

    public void transfer(double transfer){

        if (this.balance >= transfer){

        System.out.println(transfer + "$ is transferred from your account");
        this.balance -= transfer;}
        else{
            System.out.println("you don't have enough funds");
        }


    }

    public void info(){
        System.out.println("Name : " + this.holderName);
        System.out.println("Type : " + this.type);
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Balance : " +this.balance + "$");

    }



}
