package oca;

public class CheckingAccount{
    public int amount;
    public CheckingAccount(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
    public void changeAmount(int x){

        amount += x;
    }

    public static void main( String[] args ) {
        CheckingAccount acct = new CheckingAccount ( (int) (Math.random()*1000) );
        acct.changeAmount ( acct.getAmount ());
        System.out.println (acct.getAmount ());

    }
}  //acct.amount =0;
// acct.changeAmount (-acct.amount);
//acct.changeAmount (-acct.getAmount);
