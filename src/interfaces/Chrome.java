package interfaces;

public class Chrome implements BookMark{
    @Override
    public void addUrlToBookMark( String url ) {
        System.out.println(url + "was added to Bookmarks");

    }

    @Override
    public void removeUrlFromBookMark( String url ) {
        System.out.println(url + "was removed from Bookmarks");

    }
}
