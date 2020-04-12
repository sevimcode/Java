package abstraction;

public class InternetUsing{

    public static void main( String[] args ) {
        Chrome chrome = new Chrome();
        chrome.version = 65.7;
        chrome.launch();
        chrome.browse("www.stackoverflow.com"); // we override our own method we don't need to see parents methods
                                                // abstraction solves that problem
        System.out.println("----------------------------");

        Firefox firefox = new Firefox();
        firefox.launch();
        firefox.browse("www.stackoverflow.com");





    }
}
