package interviewquestions;

import java.util.ArrayList;

public class Duplicates{

    public static void main( String[] args ) {

        int[] num = { 1 , 2 , 3 , 3 , 5 , 6 , 7 , 7 , 8 , 9 , 7 , 10 };
        int count = 0;
        for (int i = 0;i < num.length;i++) {
            count = 0;
            for (int j = 0;j < num.length;j++) {
                if (num[ i ] == num[ j ]) {
                    count++;
                }
            }
            if (count > 1) {  // it finds more than one time passing numbers 33777
                System.out.println(num[ i ]);
            }
        }
        System.out.println("more than one time passing numbers");
        System.out.println("---------------------");


        int[] num1 = { 1 , 2 , 3 , 3 , 5 , 6 , 7 , 7 , 8 , 9 , 7 , 10 };
        int count1 = 0;
        for (int i = 0;i < num.length;i++) {
            count1 = 0;
            for (int j = 0;j < num.length;j++) {
                if (num1[ i ] == num1[ j ]) {
                    count1++;
                }
            }
            if (count1 == 2) {   //it finds only two time passing numbers 33
                System.out.println(num1[ i ]);
            }
        }

        System.out.println("only two time passing numbers");
        System.out.println("---------------------");


        int[] num2 = { 1 , 2 , 3 , 3 , 5 , 6 , 7 , 7 , 8 , 9 , 7 , 10 };
        int count2 = 0;
        for (int i = 0;i < num2.length;i++) {
            count2 = 0;
            for (int j = 0;j < num2.length;j++) {
                if (num2[ i ] == num2[ j ]) {
                    count2++;
                }
            }
            if (count2 == 1) {   //it finds only one passing numbers
                System.out.println(num2[ i ]);
            }
        }

        System.out.println("only one time passing numbers");
        System.out.println("---------------------");

        int[] num3 = { 1 , 2 , 3 , 3 , 5 , 6 , 7 , 7 , 8 , 9 , 7 , 10 };
        ArrayList<Integer> result = new ArrayList<>();


        for (int i = 0;i < num3.length;i++) {

            if (!result.contains(num3[ i ])) //this prints every unique element
                result.add(num3[ i ]);

        }

        System.out.println(result);
        System.out.println("every unique numbers");


        int[] num4 = { 1 , 2 , 3 , 3 , 5 , 6 , 7 , 7 , 8 , 9 , 7 , 10 };
        int count4 = 0;
        ArrayList<Integer> result1 = new ArrayList<>();

        for (int i = 0;i < num4.length;i++) {
            count4 = 0;
            for (int j = 0;j < num4.length;j++) {
                if (num4[ i ] == num4[ j ]) {
                    count4++;
                }
            }

                if ((count4 > 1) && !result1.contains(num4[ i ])) {
                    result1.add(num4[ i ]);}


            }

        System.out.println(result1);
        System.out.println("more than one time passing numbers as a unique list");
        System.out.println("---------------------");
        }



    }




