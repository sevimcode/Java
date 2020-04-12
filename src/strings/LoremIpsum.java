package strings;

public class LoremIpsum{


    public static void main( String[] args ) {
        System.out.println(doesContain("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Risus in hendrerit gravida rutrum. Cursus turpis massa tincidunt dui ut. Quisque non tellus orci ac. In nisl nisi scelerisque eu ultrices vitae auctor eu augue.\n"));
    }

    public static boolean doesContain(String str){

        String [] arr = str.split(".");

        if (arr[2].contains("massa"))
            return true;
        else

        return false;
    }


}
