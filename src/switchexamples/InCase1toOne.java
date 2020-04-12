package switchexamples;

public class InCase1toOne {

    public static void main ( String[] args ) {
        int i = 3;
        switch (i)    //switch does not support double you can use char , string,
        {
            case 1:
            System.out.println ("one");
            break;  // without break it will print subsequent cases will not go out
            case 2:
            System.out.println ("two");
            break;
            case 3:
            System.out.println ("three");
            break;
            case 4:
            System.out.println ("four");
            break;
            case 5:
            System.out.println ("five");
            break;
            default :
                System.out.println (" No match !");  // if any of cases does not match
        }
    }
}
