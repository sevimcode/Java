package methods;

public class Calculator{


    public static int calculator (char operator, int num1, int num2){

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2; // saim's solution return
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("invalid operator");

        }
return result;

    }

    public static void main(String[] args){

        System.out.println(calculator('+',90,10));


    }

    }




