package enums;

public class UsingEnums{

    public static void main( String[] args ) {
//two way to create enum


 // 1. from declaration on Enums    file
        Enums.LetterGrade grade1;  // Enums is a class name LetterGrade is the name of enum  grade is variable
        grade1 = Enums.LetterGrade.A; // you add the reference


   //2. from enum class
        // it is coming from different EnumFile class

        EnumFile grade = EnumFile.B;  // when you change the field it goes to case
   //     EnumFile grade = EnumFile.X; //if you put something out side of field X it does not compile
        switch (grade) {
            case A:
                System.out.println("you got A");
                break;
            case B:
                System.out.println("you got B");
                break;
            case C:
                System.out.println("you got C");
                break;
            case D:
                System.out.println("you got D");
                break;
            case E:
                System.out.println("you got E");
                break;
            case F:
                System.out.println("you got F");
                break;
        }}

    public void getGrade(Enums.LetterGrade grade){  // you can make your own methods and give enum values as a parameter

        switch (grade){}
        // you can put your code

    }

}
