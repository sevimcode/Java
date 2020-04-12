package mondays;

import java.util.Scanner;

public class countPositiveNegative {

    public static void main ( String[] args ) {
       int positive=0;
       int negative = 0;
       int zero=0;
       String yn="";
        int number=0;

        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter the number : ");
            number = input.nextInt();
            input.nextLine();

            System.out.print("Do you want to continue y/n? ");
            yn = input.nextLine();

            if (number >0){
                positive++;}
            else if (number<0){
                negative++;}
            else {
                zero++;}

        }while (yn.equals("y"));



        System.out.println("Positive numbers:"+positive);
        System.out.println("Negative numbers:"+negative);
        System.out.println("Zero numbers:"+zero);}



}


