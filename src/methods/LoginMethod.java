package methods;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class LoginMethod{

    public static boolean loginMethod(String username, String password ){

        String validUsername = "sevimsurucu" ;
        String validPassword= "123";

        if (validUsername.equals(username) && validPassword.equals(password))
            return true;
        else            // you don't need to write else just put }
        return false;
    }


    public static void main(String[] args){
      //  Scanner input = new Scanner(System.in);

        if (loginMethod("sevimsurucu", "123")){
            System.out.println("you logged in");
        }else{
            System.out.println("invalid credentials");
        }




    }




}
