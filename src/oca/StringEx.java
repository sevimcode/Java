package oca;

public class StringEx{

    String myStr = "7007";

    public void doStuff (String str){
        int myNum =0;
        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        }catch (NumberFormatException ne){
            System.out.println("error");
        }
        System.out.println("myStr:" + myStr + " myNum :" + myNum);


        }

    public static void main( String[] args ) {
        StringEx obj = new StringEx();
        obj.doStuff("9009");
    }
    }// prints myStr:7007 myNum :9009

