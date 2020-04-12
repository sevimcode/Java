package oca;

public class StaticVariableMethod{

    static int count =0;
    int i = 0;

    public void changeCount(){

        while (i<5){
            i++;
        count++;}

    }

    public static void main( String[] args ) {
        StaticVariableMethod check1 = new StaticVariableMethod();
        StaticVariableMethod check2 = new StaticVariableMethod();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count + " : " + check2.count);  // static variable shared with objects
        // answer is 10:10
    }

}
