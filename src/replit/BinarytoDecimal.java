package replit;

import java.util.Scanner;

public class BinarytoDecimal {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int[] binary = new int[8];
            for(int i =0; i < binary.length; i++) {
                binary[i] = input.nextInt();
            }

            //TODO: Write your code below.

            int res = 0;
            int check = 128;

            for (int i = 0; i < binary.length; i++) {
                if (binary[i] == 1) {
                    res += check;
                }

                check /= 2;
            }

            System.out.println(res);

        }
    }



