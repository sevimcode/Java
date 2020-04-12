package oca;

public class Employee2{

    public int salary;

    public static void main( String[] args ) {
        Employee2 employee = new Employee2 ();
        Manager manager= new Manager();
        Director director = new Director();
//manager.stockoptions = 500;
//employee.budget = 1000;   fail to compile parents can not see childs variables
    }
}

