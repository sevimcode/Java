package objectscreating;

public class FaceBookTest{

    public static void main(String[] args){


        FaceBook user = new FaceBook("ebrucu" , "444444" , "Sevim" , 39 , 300);

        FaceBook user2 = new FaceBook("ebryyyu" , "445544" , "Murat" , 39 , 555);


         user.sendFriendRequest(user2);
        System.out.println(user.sendFriendRequest(user2));
         user.info();
         user2.info();


    }
}