// the method writes hi 5 times

package methods;

public class VoidMethods{

    // you should be outside of the main method for creating method
    public static void main(String[] args){
        sayHi();  // it does not give anything String s= sayHi(); will not be allowed here
        sayBye();
        sayHi();


    }

    public static void sayHi(){   //public static then return type:void then name of the method:sayHi
        for (int i = 0;i < 5;i++) {
            System.out.println("Hi!");
        }
    }


    public static void sayBye(){   //public static then return type:void then name of the method:sayBye
        System.out.println("Bye!");
    }


}
