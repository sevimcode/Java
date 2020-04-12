package methods;

import com.sun.org.apache.xpath.internal.objects.XString;

public class MultipleReturns{

    public static int checkNumber(int num){

        if (num<0){
            return 0;

        }else{
            return num; // if it is not negative number the method returns your number
        }

    }

    public static int stringLength(String str){
        int count=0;
        for (int i = 0; i<str.length(); i++){   // counts the characters of the string
            count++;
        }

        return count;

    }

    public static void main(String[] args){
        System.out.println("negative numbers" + checkNumber(-3)); // print 0
        System.out.println("positive numbers" + checkNumber(4));    // print 4

        System.out.println(stringLength("word"));  // method counts the string by length



    }



}
