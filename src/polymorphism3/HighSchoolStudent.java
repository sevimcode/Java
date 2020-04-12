package polymorphism3;

public class HighSchoolStudent extends Student{

    private int gradeLevel;

    public HighSchoolStudent(String name, int number, int grade){
        super(name, number);
         setGrade(grade);

    }

    public void info(){
        super.info();
        System.out.println("Grade level " + getGrade());

    }

    public int getGrade() {
        return gradeLevel;
    }

    public void setGrade( int grade ) {
        if (grade >=9 && grade<=12 ){
        this.gradeLevel = grade;}
        else{
            System.out.println("invalid program");
            System.exit(0);
        }
    }
    public boolean equals(HighSchoolStudent otherStudent){
       return super.equals(otherStudent) && this.getGrade() == otherStudent.getGrade();



    }
}
