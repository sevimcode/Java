package polymorphism;

import java.util.ArrayList;

public class SchoolAccounting{  // this is our application

    public static void main( String[] args ) {

        PaymentMethod pm1 = new BankAccount();  //payment methods of students
        PaymentMethod pm2 = new CreditCard();
        PaymentMethod pm3 = new Paypal();
        PaymentMethod pm4 = new Paypal();
        PaymentMethod pm5 = new BankAccount();

        MobileVerifiable mv = new Paypal(); // child of PaymentMethod Paypal is mobileverifiable too

        //polymorphic array  you use different objects in the array
        ArrayList<PaymentMethod> studentPayments = new ArrayList<>(); // you can store any type of payment methods in this arraylist with help of polymorphism
        studentPayments.add(pm1);
        studentPayments.add(pm2);
        studentPayments.add(pm3);
        studentPayments.add(pm4);
        studentPayments.add(pm5);


        for (PaymentMethod p : studentPayments) {
            p.charge(500); // it is charging whatever they have charge from here


        }
    }
}