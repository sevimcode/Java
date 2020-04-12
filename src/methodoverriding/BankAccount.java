//Create a class BankAccount  Public instance variables: balance, accountNumber,
//        name  
//        methods:  
//        info: This method shows the details of the BankAcount.
//        Print balance, account number and name in this method implementation.  
//        transfer: This method accepts double and doesn’t return anything.
//        Method should subtract the amount given and 10% of given amount as a transfer fee. 
//          deposit: Method accept double and adds this amount to the balance.   
//        Create a class CheckingAccount.   Extend this class to BankAccount.   override the method transfer.
//        Checking account’s transfer should be only 5% fee for transferring. Special case: Check if balance is enough.
//        If not enough give proper message and don’t transfer. 
//        Create a class SavingsAccount.  Add interestIncome instance variable. Extend it to BankAccount.
//          Override the transfer here as well. SavingsAccount transfer should be 20% fee. \
//         Override info method. Change the implementation and print all the info including interestIncome information as well.
//          Create additional method calculateAnnualInterestIncome. 3% of the current balance should go to interestIncome. 
//         Override Object class’s toString method. Build a proper String with all instance variables and return the string. 








package methodoverriding;

public class BankAccount{

    double balance;
    long accountNumber;
    String name;


public void info(){
    System.out.println("Bank Account number : " + this.accountNumber);
    System.out.println("Name : " + this.name);
    System.out.println("Balance : " + this.balance);
}
public void transfer(double transfer){
    System.out.println("Money transfered : " + transfer);
    double transferFee = (transfer/100)*10;
    this.balance = (this.balance - transfer)-transferFee;

}

    public void deposit(double deposit){

        this.balance += deposit;
        System.out.println("Deposit successful!");

    }

    @Override
    public String toString(){

        String result = "Bank Account : " + this.accountNumber +  "\nBalance : " + this.balance + "\nName : " + this.name ;

        return result;
    }



    public static void main( String[] args ) {
        BankAccount ba = new BankAccount();
        ba.balance = 50000;
        ba.accountNumber=78758969;
        ba.name = " jhon Mc. Donald";
        ba.transfer(500);
        ba.deposit(59);
       // ba.info();
        System.out.println(ba);


    }


}
