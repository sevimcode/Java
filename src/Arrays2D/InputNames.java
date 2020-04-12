package Arrays2D;
import java.util.Arrays;
import java.util.Scanner;

public class InputNames{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.println("how many groups you have  :");
        int g = input.nextInt();
        input.nextLine();

        String[][] array = new String[ g ][ ];

        for (int i = 0;i < array.length;i++) {

            System.out.println("how many people in your group :" +(i+1));
            int p = input.nextInt();
            input.nextLine();
            String [] people = new String[p];
            for (int j = 0;j <people.length;j++) {
                System.out.println("enter name" + (j+1));
                people[j] = input.nextLine();

            }
            array [i]=people;

        }
        System.out.println(Arrays.deepToString(array));

    }

}
