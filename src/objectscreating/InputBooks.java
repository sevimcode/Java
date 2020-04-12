package objectscreating;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class InputBooks{


    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.println ("How many book ? :");
        int howMany = input.nextInt ();
        input.nextLine();
        Book [] library = new Book[howMany];

        for (int i=0; i<library.length ; i++){

            System.out.println ("Title ? :" + (i+1)); // you can not take the input directly to the array
         String title= input.nextLine ();

        System.out.println ("Author :" + (i+1));
          String author = input.nextLine ();

        System.out.println ("Pages :");
           int pages  = input.nextInt ();
            input.nextLine();

//        Book eachbook = new Book(title, author,pages); // every time you need to create an object and put it to array
//        library[i]= eachbook;

            library[i]= new Book(title, author,pages); //short way of it you don't need a reference name

        }

        for (Book books1 : library  ){
           books1.info();
        }
    }




}
