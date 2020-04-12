package encapsulation;

public class AppTest{

    public static void main( String[] args ) {
        App whatsUp = new App("whatsUp", "social network", 2.3);

        whatsUp.info();
        whatsUp.setSize(2.6);
        whatsUp.info();
        System.out.println(App.numberOfApps);
        whatsUp.setReviews("cool app");
        System.out.println(whatsUp.getReviews()); // prints [cool app]
        whatsUp.setReviews("cool");
        System.out.println(whatsUp.getReviews()); // prints [cool app, cool]

    }
}
