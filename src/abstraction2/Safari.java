package abstraction2;

public class Safari extends Browser{

    @Override
    public void launch() {
        System.out.println("safari is launching");
    }

    @Override
    public void browse( String url ) {
        System.out.println("safari browsing the URL " + url);

    }

    @Override
    public int getNumOfTabs() {
        System.out.println("Safari getting number of tabs");
        return 0;
    }

    @Override
    public void close() {
        super.close();
    }
}
