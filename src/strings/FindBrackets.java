//10) User will be given a string:
//        “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
//        > You will separate these parts and print them separately. > Print the following:
//        “Sender: actualSender”
//        “Number: actualNumber”
//        “Message: actualMessage”
//
//

package strings;

public class FindBrackets {
    public static void main ( String[] args ) {
        String given = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";

        int sen = given.indexOf ( "<" );
        int dot1 = given.indexOf ( ">" );

        int form = given.indexOf("[");
        int dot2 = given.indexOf ("]");

        int brac1 = given.indexOf ("{");
        int brac2 = given.indexOf ( "}" );



          System.out.println ( "Sender:"+ given.substring ( sen+1, dot1 ) );
          System.out.println ( "Number:" + given.substring ( form+1, dot2));
          System.out.println ( "Message:" + given.substring (brac1+2 , brac2));


    }
}