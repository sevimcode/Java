
//Create a class SavingsAccount.  Add interestIncome instance variable. Extend it to BankAccount.
//          Override the transfer here as well. SavingsAccount transfer should be 20% fee. \
//         Override info method. Change the implementation and print all the info including interestIncome information as well.
//          Create additional method calculateAnnualInterestIncome. 3% of the current balance should go to interestIncome. 
//         Override Object class’s toString method. Build a proper String with all instance variables and return the string. 




package methodoverriding;

public class SavingAccount extends BankAccount{

    double interestIncome;

    @Override
    public void transfer( double transfer ) {
        double transferFee = (transfer/100)*20;
        this.balance = (this.balance - transfer)-transferFee;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Interest Income :" + this.interestIncome);
    }

    public void calculateAnnualInterestIncome (){

        this.interestIncome += (this.balance/100)*3;


    }


}
