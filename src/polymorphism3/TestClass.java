package polymorphism3;

import java.util.ArrayList;

public class TestClass{

    public static void main( String[] args ) {


        HighSchoolStudent student = new HighSchoolStudent("james", 19,10);
        student.info();

        HighSchoolStudent student1 = new HighSchoolStudent("james", 19,10);
        student.info();

        System.out.println(student.equals(student1));

        Person student2 = new HighSchoolStudent("adam", 19, 11);
        System.out.println(student.getGrade());

        System.out.println(((HighSchoolStudent)student2).getGrade());  // person does not know grade level it in the highschoolstudent

                                                                        // that's why we cast it

        Person [] people = new Person[3];
        people[0]= student;
        people[1]= student1;
        people[2]= student2;

        for (Person p: people){
         p.info();         // printing each person information
       }



    }



}
