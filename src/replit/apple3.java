package replit;

public class apple3{


    public static void main( String[] args ) {

        String word = "appplleeaaall";
        String checked = word.charAt(0) + "";
        int count =1;

        for (int i = 0;i < word.length();i++) {

            count=0;
            for (int j = 0;j < checked.length();j++) {

                if(word.charAt(i) == checked.charAt(j)){
                    count=1;
                }

            }
          if (count == 0)
           checked += word.charAt(i)+"";
        }


        System.out.println(checked);

    }}

