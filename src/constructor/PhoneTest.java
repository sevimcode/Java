package constructor;

public class PhoneTest{

    public static void main(String[] args){

        Phone myPhone = new Phone("iphone", "black" , -5 , true); //memory -5 prints "memory : 0"

        myPhone.info();

        Phone myPhone1 = new Phone("samsung", "gold" , 50 , true);
        myPhone1.info();

        System.out.println("-------------------");

        boolean result = myPhone1.text(9008768787L, "hello"); // if it is bigger than integer you need to add L to end of the number
        System.out.println(result); //returns true prints true

    }


}
