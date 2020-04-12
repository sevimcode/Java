package methods;



public class ReturnTypeMethod{

    public static int getThree(){

        return 3;

    }
    public static String getDate(){
        String date = "3/6/2019";
        return date.replace("/","");  // you can do manipulation on return


    }
    public static String getToday (String date  ){ // you can put parameters in the return type methods

        return date.replace("/","");  // you can do manipulation on return


    }
    public static void main(String[] args){
        int a= getThree();
        System.out.println(a);
        System.out.println(getThree()); // prints 3
        a = getThree() + 7;  // prints 10 you can make operation with your method
        System.out.println(getDate()); // prints 2019

        String date = getDate(); // we catch the method here // this date variable is not the date in the method this is new one
        System.out.println(date); // if you want to use date you need to catch it first

    }


}
