package methods;

public class OddNumbersMethod{


    public static void main(String[] args){

      odds();
      PrintHi50times.hi(); // you need to call other method created in printhi50times you need to put "class name" and "the method name"
    }

    public static void odds(){   //public static then return type:void then name of the method:sayHi
        for (int i = 0;i <101;i++) {
          if (i%2==1)
          {
              System.out.println(i);
          }
        }
    }


}
