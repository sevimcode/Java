
//10) Given a Strings of "Jamesbond3@gmail.com", "notvalid@.com", "Adam5@yahoo.com", “Fran2113gmailcom", “JamieM@yahoo.com"
//        Print all the emails that are valid. A valid email has the ‘@‘ sign that comes before the ‘.’
//
//



package arrays;

public class EmailArray {

    public static void main ( String[] args ) {
        String[] email = { "Jamesbond3@gmail.com" , "notvalid@.com" , "Adam5@yahoo.com" ,
                "Fran2113gmailcom" , "JamieM@yahoo.com" };


        for (int i = 0;i < email.length;i++) {

            if (email[ i ].contains ("@") && email[ i ].contains (".")) {

                int at = email[ i ].indexOf ("@"); // getting position munber of the at
                int dot = email[ i ].indexOf ("."); // getting position munber of the dot

                if (at < dot) {
                    System.out.println (email [i] + "Valid");  //checking whether at coming before dot
                } else {
                    System.out.println (email [i] + "invalid");
                }

            } else{

                    System.out.println ("invalid");
                }

            }
        }

    }

















