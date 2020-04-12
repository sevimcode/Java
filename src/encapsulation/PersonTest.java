package encapsulation;

import java.util.Scanner;

public class PersonTest{

    public static void main( String[] args ) {


        Scanner input = new Scanner(System.in);


        Person person = new Person();
        do {
            System.out.println(" how old are you? ");
            person.setAge(input.nextInt());

        }while (person.getAge() == 0);  //it is asking user until they put valid age


        person.setName("sevim");
        person.setGender("female");
 
        person.setHeight(150);
        person.setWeight(106);

        person.info();




    }
}
