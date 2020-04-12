package mondays;
import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[ 8 ];
        for (int i = 0;i < inhabitants.length;i++) {
            inhabitants[ i ] = input.nextInt();
        }

        System.out.println("Day 0 " + Arrays.toString(inhabitants));
        boolean check = false;
        int [] inhabitantsnew = new int[8];
        int day = 1;
        int sum = 0;
        for (;;) {
            for (int i = 0;i < inhabitants.length;i++) {
                check = false;
                inhabitantsnew[i]=inhabitants[i];
                if (i == 0) {

                    if (inhabitants[ 1 ] == 0) {
                        inhabitantsnew[ 0 ] = inhabitantsnew[ 0 ] / 2;

                    }
                }

                if (i == 7) {
                    if (inhabitants[ 6 ] == 0) {
                        inhabitantsnew[ 7 ] = inhabitantsnew[ 7 ] / 2;
                    }
                }


                if (i > 0 && i < 7) {
                    if (inhabitants[ i + 1 ] == 0) {
                        check = true;
                    }
                    if (inhabitants[ i - 1 ] == 0) {
                        check = true;
                    }

                    if (check) {
                        inhabitantsnew[ i ] = inhabitantsnew[ i ] / 2;
                    }

                }
            }
            for (int i = 0;i < 8;i++) {
                sum += inhabitantsnew[ i ];
                inhabitants[i]=inhabitantsnew[i];
            }

            System.out.println("Day " + day + " " + Arrays.toString(inhabitantsnew));
            day++;



            if (sum == 0) {
                System.out.println("---- EXTINCT ----");
                return;
            }
            sum = 0;

        }

    }}












