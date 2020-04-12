package replit;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber500 {


    public static String armstrongNumbers(int N){


        String str = "";

      for (int i =1; i<N ; i++) {
          int number = i;
          int length = ( i + "" ).length();
          int result =0;
          while ( number > 0 ) {

              int digit = number % 10;
              result += Math.pow(digit , length);
              number = number / 10;

          }
          if (result == i)
              str += result + " ";
      }

      return str;
    }

    public static void main ( String[] args ) {

        int result = 0;

        for (int i= 1; i < 501; i++) {

            String str = String.valueOf (i);
            int[] arr = new int[str.length()];

            result =0;
            for (int a = 0;a < arr.length;a++) {
                arr[ a ] =  str.charAt(a)  - 48;}


            for (int  b = 0;b < arr.length;b++) {
                result += arr[ b ] * arr[ b ] * arr[ b ];}

            if (i == result)
                System.out.println (i);

        }


        System.out.println(armstrongNumbers(500));


        }


}

