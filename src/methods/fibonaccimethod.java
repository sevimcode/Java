package methods;

public class fibonaccimethod{

    public static void fibo(int n){

       int a=0;
       int b=1;


        for (int i=1; i<=n ;i++ ){

            if (b>n)
                break;
            int c= a+b;
            a=b;
            b=c;
            System.out.println(b+" ");



        }

    }

    public static void main(String[] args){
        fibo(100);
    }


}
