package ifElseStatements;

import java.util.Scanner;

public class PasswordValid{

    public static void main( String[] args ) {
        login();
    }

    public static void login(){
        Scanner input = new Scanner(System.in);

        System.out.println("you clicked login button ");
        System.out.println("please enter your account name :");
        String actualAccountName = input.nextLine();
        System.out.println("please enter your password");
        String actualPassword = input.nextLine();

        String expectedID="jhonjava";
        String expectedPassword = "123456";

        if (expectedID.equalsIgnoreCase(actualAccountName)) {
            if (expectedPassword.equalsIgnoreCase(actualPassword)) {

                System.out.println("login successful");
            }else{
                System.out.println("invalid password");
            }
        }else{
            System.out.println("not a valid username");












    }








    }




}
