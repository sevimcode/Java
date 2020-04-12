package methodoverloading;

public class DataTypePromotion{

    public static void calc (double d){

        System.out.println("using double");
    }

    public static void calc (float f){
        System.out.println("using float");


    }

    public static void main(String[] args){
        int a=10;
        calc(a);  // even though data type is not there it is using the biggest closest data overloded method

        // prints using float
    }


}
