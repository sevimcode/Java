package enums;

public class Calculator{


    public static void main( String[] args ) {

        System.out.println(calc(Operators.DIVIDE, 10,20));

    }
    public static int calc( Operators o , int a , int b ) {
      int r=0;
        switch (o) {

            case PLUS:
                return a + b;

            case MINUS:
                return a - b;

            case DIVIDE:
                if (b == 0) {
                    System.out.println("you can not divide by 0 ");
                    return 0;
                } else {
                    return a / b;
                }

                case MULTIPLY:

                return a * b;

                case REMINDER:
                    if (a==0 || b==0){
                        System.out.println("invalid remainder operation");
                    }else{
                        return a%b;
                    }


        }
        return 0;


    }
}