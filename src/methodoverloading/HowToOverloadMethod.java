package methodoverloading;

public class HowToOverloadMethod{

    public static void jump(){

        System.out.println("you don't get far");
    }

    public static void jump(String shoes){

        System.out.println("this shoes get you far");
    }

    public static String  jump(String[] arr){   // taking array returning String

       return "jumped by array";

    }


        public static void jump(int distance){

        System.out.println("you jumped " + distance);}
        public static void jump(String shoes, int distance){

                System.out.println("this shoes great that much of "+distance);
            }

      // public static void jump(int kilometer){ if you want to make same thing but different name java does not takes it

     //   System.out.println("you jumped" + distance);}  // there is conflict here, this is not overloading!

    public static void main(String[] args){


        jump();   // you don't get far
        jump(5); // you jumped 5
        jump("nike"); // this shoes get you far
        jump("nike", 5); //this shoes great that much of 5
        String [] array = {"nike", "adidas"};
        System.out.println(jump(array)); //jumped by array  since it is return type method we need to catch it



    }

    }
