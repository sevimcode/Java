//Prime Number  Create a method that will accept a number (int).
//        Return an ArrayList of all the numbers that are prime numbers
//        in the range of 1 to the given number** Hint: make a helper method first,
//        isPrimeEx:>
//        input: 50> output: [1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47]

package interviewquestions;

import java.util.ArrayList;

public class PrimeNumbers{

    public static boolean isPrime(int number){

        for (int i=2; i<number ; i++){
          if (number % i == 0)
             return false;
      }
     return true;
    }

    public static ArrayList<Integer> isPrimeEx(int number){

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i =2 ; i<number ; i++)
            if (isPrime(i))
            arr.add(i);

            return arr;
    }


    public static String  primeNumbers( int N){


        String  primeNumbers = "";

        for (int i = 1; i <= N; i++)
        {
            int count=0;
            for(int j =i; j>=1; j--)
            {
                if(i%j==0)
                    count++;
            }
            if (count == 2)
                primeNumbers += i + " ";

        }
        System.out.println("Prime numbers from 1 to 50 are :");

        return primeNumbers;
    }


    public static void main( String[] args ) {

        System.out.println(isPrimeEx(50));
        System.out.println(primeNumbers(50));
    }




}
