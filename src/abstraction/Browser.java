package abstraction;

public class Browser{

    String name;
    double version;
    double size;


    public void launch(){

        System.out.println("browser is launching");


    }
    public void browse(String url){

        System.out.println("browser is browsing URL : " + url);
    }


    public void addTab(String url){
        System.out.println("Browser is adding a tab for URL :" + url);


    }

}
