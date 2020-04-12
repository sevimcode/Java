package oca;

public class Employee1{

    String name;
    boolean contract;
    double salary;

    Employee1(){
        this.contract = new Boolean (true); // line n1
        this.salary = new Double (100) ;
        this.name = new String ("Joe");


    }
    public String toString (){
        return name+":" + contract + " : "+salary;
    }

    public static void main( String[] args ) {
        Employee1 e = new Employee1 ();
                                      //line n2
        System.out.println (e);
    }

}
//for printing joe:true:100.0
// this.contract = new Boolean (true);
//        this.salary = new Double (100) ;
//        this.name = new String ("Joe");
// or
// e.name = "Joe";
//e.contract = true;
// e.salary = 100.0;
