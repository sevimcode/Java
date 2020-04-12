package interviewquestions;

public class Armstrong{

    public static boolean isArmstrong( int number ) {

        String num = number + "";


        int sum = 0;

        for (int i = 0;i < num.length();i++) {

            int digit = Integer.parseInt(num.charAt(i) + "");

            sum += Math.pow(digit , num.length());
        }

     return (sum == number);
}


public static void main( String[] args ) {
        System.out.println(isArmstrong(153));
    }

}