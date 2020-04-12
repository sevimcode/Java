package objectscreating;

public class DebitTest{

    public static void main(String[] args){


        Debit myCard = new Debit(12345678543234L , "sevim surucu" , "master" , 5000 , 4444);
        Debit myCard2 = new Debit(1234567899543234L , "sevim surucu" , 30000);

        myCard.info();
        myCard2.info();

    }
}