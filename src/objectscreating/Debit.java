
//Create a class for Debit Card that has the following instance variables:
//        card number (long), holder name (String), card type (String), pin (int), and balance (double)
//        Create an info method that will print all of the cards information (Except the pin).
//        If the card type does not have a value do not print that line.
//        Create a constructor that will create a debit card object and initialize the card number,
//        the card holder name, and the balance. The card number has to be 16 characters long to be a valid card number.
//        If the length is too short or too big do not store the card number and print “Invalid card number”
//        Overload the constructor to take all of the instance variables.
//        The card type must be either MasterCard or Visa to be valid card type.
//        If it is not one of those two then do not store the type and print “invalid card type”.
//        Also the pin must be only 4 characters long. If the pin is more than or less than 4 characters
//        then do not store the pin into the instance variable and print “Invalid pin length”
//        Collapse

package objectscreating;


public class Debit{


    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    public void info(){

        System.out.println("Card Number :" + this.cardNumber); // if you don't put this is ok because there is no local variable here
        System.out.println("Holder Name :" + this.holderName);

        if (this.cardType != null)
        System.out.println("Card Type : " + this.cardType);
        System.out.println("Balance :" + this.balance);


    }

    public Debit ( long cardNumber, String holderName, double balance){

       String card = cardNumber+"";  // String.valueOf(int) does the same thing
        if (card.length()==16)
            this.cardNumber = cardNumber;
        else
            System.out.println("invalid card");

        this.holderName = holderName;
        this.balance = balance;


    }
    public Debit (long cardNumber, String holderName, String cardType, double balance, int pin){

        this(cardNumber,holderName,balance);  //we get all the conditions from top constructor construstor chainning

        if (cardType.equalsIgnoreCase("visa") || cardType.equalsIgnoreCase("master"))
            this.cardType = cardType;
        else
            System.out.println("invalid card");

        String p = pin+"";
        if (p.length()==4)
            this.pin = pin;
        else
            System.out.println("invalid pin length");
    }

}
