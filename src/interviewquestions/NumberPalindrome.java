package interviewquestions;

public class NumberPalindrome{
    public static boolean numberPalindrome(long number) {
        long workingNum = number;
        long reverse = 0;
        //yanlış ama burdan yürüyebiliriz
//        for(long i=10; i<=number; i*=10){
//            if(number/i==number%i) return true;
//        }
//        return false;
        //number%10 last digit of our number;
        while ( workingNum != 0 ) {
            long last = workingNum % 10;
            reverse = reverse * 10 + last;
            workingNum /= 10;
        }
         return (reverse==number);
    }





    public static boolean isNumberPalindrome(long number){

        long newNumber =0;
        long digit =0;
        int count =0;
         long number1 = number;
         long number2 = number;

        while (number1 > 0){

            digit = number1%10;

            number1 = number1 - digit;

            number1 = number1/10;

            count++;

        }

          count--;
        while (number2 > 0){

            digit = number2%10;

            number2 = number2 - digit;

            number2 = number2/10;

            newNumber += digit * Math.pow(10,count);

           count--;

        }

        System.out.println(number);
        System.out.println(newNumber);

        if (number==newNumber) return true;
        else

        return false;
    }



    }



