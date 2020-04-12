package oca;

public class ArrayQ21B{
    public static void main( String[] args ) {
        String [] colors = { "red" , "blue" , "green" , "yellow", "maroon" , "cyan"};
        int count = 0;
        for (String c: colors){
            if (count>=4){
                break;
            }else{
                continue;
            }
//            if (c.length ()>=4){
//                colors[count] = c.substring (0,3); // answer compilation fail unreachable statement here
//            }
  //          count++;
        }
        System.out.println (colors[count]);
    }
}
