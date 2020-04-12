//Create a class App
//This class represents Application on the mobile phone.
//        An instance of App should have information about its name, category, rating, description, size, list of reviews.
//        Create a constructor for App so that user can create App object only passing name, category, and size.
//        Encapsulate all instance variable.
//        Create a method open. Method is used to open the App on the phone. It should print “%appName is opening”.
//        Create a method close. Same as open method for closing.
//        Create a method update. Method should print “%appName is updating”.
//        Add static variable numberOfApps. This class member should be increased each time App object gets created.
//        Create a method info. Method should print all information about App except for reviews.
//        Modify method setReview. Method should accept String message.
//        Method adds
//        review to the list of reviews if message is at least 3 letters and prints success message.
//        If message less than 3 letters then it should NOT add the review and should print failure message.



package encapsulation;
import java.util.ArrayList;

public class App{

    private String name;
    private String category;
    private int rating;
    private double size;
    private String description;
    private ArrayList<String> reviews;
    static int numberOfApps;


    public App( String name, String category, double size){
        this.category = category;
        this.name = name;
        this.size = size;
        numberOfApps++;
        this.reviews = new ArrayList<>(); // array list need an instantiation otherwise you will have nullPointerException
//because the array list takes objects you need to assign it through constructor otherwise your program will terminate
        // if you have overloaded constructor you need to create Arraylist object there, too

    }

    public App(){

    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory( String category ) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating( int rating ) {
        this.rating = rating;
    }

    public double getSize() {
        return size;
    }

    public void setSize( double size ) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void setReviews( String rev ) {  //gets review message and add ir to arraylist

       // WRONG this.reviews = new ArrayList<>(); if you create arraylist here it will create new arraylist everytime
        // when we execute and it will erase the previous reviews

        if (rev.length() >=3){
            this.reviews.add(rev);

            System.out.println(" you added your review thanks");}

        else{
            System.out.println("wrong review");


        }
    }


    public String open(){

   return (name + "is opening");
    }

    public String close(){

        return (name + "is closing");
    }
    public String update(){

        return (name + "is updating");
    }

    public void info(){
        System.out.println(" App name : " + this.name );
        System.out.println(" App category : " + this.category );
        System.out.println(" App size : " + this.size );
        System.out.println(" App description : " + this.description );
        System.out.println(" App rating : " + this.rating );
    }




}

