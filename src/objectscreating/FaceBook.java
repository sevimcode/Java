//Facebook User:
//        Create a class for a facebook user which has the following instance variables:
//        username, password, name, age, and number of friends
//        Create a constructor which will create a facebook user by only taking the username and password.
//        If the password contains the username then it is not a valid password and should not be saved.
//        In this case Print “Password contained username. Default password created: ‘password’” and
//        set the password for the user to the default value.
//        Overload the constructor to accept username, password, and the user’s name.
//        If the name entered has any characters that are not letters from the alphabet, then the name is invalid.
//        In this case print “invalid name” and assign the name value to be ‘no name’
//        Overload the constructor to accept all of the variables.
//        Only store the age and number of friends into the variables if they are valid numbers ( No negative numbers ).
//        If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.
//        Create an info method that will print the Username, name, age and number of friends for the Facebook user.
//        Create a sendFriendRequest method that will accept a Facebook user object and send them a friend request.
//        The method should return a boolean of if the friend request was sent (true) or if the friend request was not sent (false).
//        If your friend list is at the 5000 limit then do not send the request and print
//        “You have reached the limit of friends.”
//        Also if the user you are trying to send the request to has already hit the limit
//        then print “theUsersName cannot accept any more friend request.
//        If both you and the user are under the limit print “Friend request sent to theUsersName”
//        and increase your number of friends by one.


package objectscreating;

public class FaceBook{

    String username;
    String password;
    String name;
    int age;
    int numberOfFriends;


    public FaceBook(String username , String password){

        this.username = username;

        if (password.contains(username))
            System.out.println("Password contained username. Default password created: ‘password’");
        this.password = "password";

    }

    public FaceBook(String username , String password , String name){
//        boolean valid =true;
        this(username , password);
        for (int i = 0;i < name.length();i++) {


//           if (!Character.isLetter(name.charAt(i)))    saim's solution
//               valid= false;
//                 break;
//
//                 if (valid)


            if (( name.charAt(i) >= 'A' && name.charAt(i) <= 'Z' ) || ( name.charAt(i) >= 'a' && name.charAt(i) <= 'z' )) {

                this.name = name;
            } else {
                this.name = "no name";
                break;
            }
        }
    }

    public FaceBook(String username , String password , String name , int age , int numberOfFriends){

        this(username , password , name);

        if (age < 0) {

            System.out.println(" invalid age ");
        } else {
            this.age = age;

            if (numberOfFriends < 0) {
                System.out.println(" invalid number of friends ");
            } else {
                this.numberOfFriends = numberOfFriends;
            }
        }
    }

    public void info(){


        System.out.println("facebook user");

        System.out.println("username : " + username);
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("number of friends : " + numberOfFriends);

    }

    public boolean sendFriendRequest(FaceBook user2 ){

        boolean check = false;


       if ((this.numberOfFriends<5000) && (user2.numberOfFriends<5000)){
            System.out.println("Friend request sent to " + user2.name);
            check = true;
            this.numberOfFriends++;
            user2.numberOfFriends++; }


        else if (this.numberOfFriends>=5000){
            System.out.println("You have reached the limit of friends");
       }


        else {
            System.out.println(user2.name + " cannot accept any more friend request");
              check=false;}

        return check;
    }




}






