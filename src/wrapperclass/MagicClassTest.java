package wrapperclass;

public class MagicClassTest{

    public static void main(String[] args){


   MagicNumber magicRef = new MagicNumber();
        magicRef.magic(5);
        System.out.println(magicRef.array);




        MagicNumber magicRef1 = new MagicNumber();
        magicRef1.generateEven(7);

        System.out.println(magicRef1.array);


    }
}
