package oca;

public class CCMask{

    public static String maskCC(String creditCard){

        String x = "XXXX-XXXX-XXXX-";
       // return x+creditCard.substring(15,19);  // showing last 4 digit
        StringBuilder sb = new StringBuilder (x); // showing last 4 digit
        sb.append(creditCard,15,19);
        return sb.toString();
    }

    public static void main( String[] args ) {
        System.out.println(maskCC("1234-5678-7654-3324"));
    }
}
//XXXX-XXXX-XXXX-3324
//         return x+creditCard.substring(15,19);

//         StringBuilder sb = new StringBuilder (x);
//        sb.append(creditCard,15,19);
//        return sb.toString();