
//BMI: Program will ask user to enter their mass (pounds) and their height (feet).
//        Calculate their BMI and then print the appropriate message based on the provided values:
//        —> BMI Formula: BMI = mass / height^2
//        —> Values:
//        Less than 18.5 — Underweight
//        From 18.5 to 25 — Normal weight
//        From 25 to 30 — Overweight
//        More than or equal to 30 — Obese


package ifElseStatements;

import java.util.Scanner;

public class bmiCalculator {


    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );

        System.out.println ( " What is your weight : " );
        double weight = input.nextDouble ();
        System.out.println ( " What is your height : " );
        double height = input.nextDouble ();

        double height1 = height * height;
        double bmi = weight / height1;


        if (bmi < 18.5)
            System.out.println ( " underweight" );

            else if (bmi >= 18.5 && bmi < 25)

                System.out.println ( "Normal weight" );

           else if (bmi >= 25 && bmi < 30)

                System.out.println ( "Over weight" );
            else

                System.out.println ( "Obese" );


    }
}