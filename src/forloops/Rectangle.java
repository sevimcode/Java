package forloops;

public class Rectangle {

    public static void main ( String[] args ) {

        for (int i=1; i<8 ; i++)
        {
            if (i==1 || i == 7){
                System.out.println("******");
            } else{

                if ((i==2 || i == 4 || i==6))
                    System.out.println("      ");
                else
                    System.out.println("*    *");
            }

        }


    }




}






