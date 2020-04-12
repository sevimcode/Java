package polymorphism3;

public class Student extends Person{

    private int studentNumber;

    public int getStudentNumber() {
        return studentNumber;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Student number : " + getStudentNumber());
    }

     //s1.equals(s2)
    public boolean equals(Student otherStudent){
    return this.hasSameName(otherStudent) && this.getStudentNumber() == otherStudent.getStudentNumber(); // student has same name and id


    }



    public void setStudentNumber( int studentNumber ) {
        this.studentNumber = studentNumber;


    }

    public Student( String name, int number){   // since we don't have default constructor extneds complains
        super(name);
        setStudentNumber(number);

    }



}
