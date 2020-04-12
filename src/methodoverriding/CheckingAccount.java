
//Checking account’s transfer should be only 5% fee for transferring. Special case: Check if balance is enough.
//        If not enough give proper message and don’t transfer. 



package methodoverriding;

public class CheckingAccount extends BankAccount{

    @Override
    public void transfer( double transfer ) {
     double total = transfer + (transfer*0.05);
        if (this.balance>=total) {
            System.out.println("Transfer successful");
            this.balance -=total;
        } else{
            System.out.println(" not sufficient balance for transfer");

        }

    }
}
