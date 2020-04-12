package abstraction;

public class Chrome extends Browser{


    @Override
    public void launch(){   // when you override vOid return method you must have a void return in the overriding.
        System.out.println("Chrome is launching"); // once you override the parent method it will ignore the parent method


    }


    @Override
    public void browse(String url){
        System.out.println("Chrome is browsing the url " + url);
    }


}
