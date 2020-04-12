package abstraction2;

public class Chrome extends Browser{ // you must create your own implementation of all of the parent abstract class methods
    // as a child of the abstract class
    @Override
    public void launch() {
        System.out.println("Chrome is launching");

    }

    @Override
    public void browse( String url ) {
        System.out.println("chrome is browsing URL " + url);

    }

    @Override
    public int getNumOfTabs() {
        System.out.println("Chrome is returning number of tabs open ");
        return 0;
    }


}
