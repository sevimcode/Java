package oca;

public class EBook extends Book{   // line n3
    public void readBook(){
        System.out.println ("read e book");
    }


    @Override
    public void download() { // compilation fail line n3 we need to override download

    }
}
