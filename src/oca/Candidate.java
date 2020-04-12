package oca;

public class Candidate{
    String name;
    int age;
    Candidate(String name, int age) throws Exception{
        if (name == null) {
            throw new MissingInfoException ();
        }else if (age<=10 || age >= 150){
            throw new AgeOutOfRangeException ();

        }else{
            this.name= name;
            this.age = age;
        }
    }
    public String toString(){
        return name + " age : " + age;
    }

    public static void main( String[] args ) throws Exception { // answer add main method throws Exception
        Candidate c = new Candidate ("James", 20);
        Candidate c1 = new Candidate ("Williams", 32);
        System.out.println (c);
        System.out.println (c1);

    }
}// prints  James age : 20
 //        Williams age : 32

