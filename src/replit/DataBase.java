package replit;




import java.util.Arrays;

public class DataBase{


    public static String lameDb(String db, String op, String id, String data){

       int count=0;
        String[] array = db.split("#");
        int i = Integer.valueOf(id);


        String raw = array[ i - 1 ];
        System.out.println(raw);
        String word = "";
        String number="";
        String result="";



        for (int j = 0;j < raw.length();j++) {
            if (raw.charAt(j) >= '0' && raw.charAt(j) <= '9'){
             count++;}}

//raw = number+word

            word = raw.substring(count+1) ;
            number = raw.substring(0,count+1);
            System.out.println(word);
            System.out.println(number);
            System.out.println(Arrays.toString(array));

            if (op.equals("add")){

                array[i-1] = number+word+data;}

            else if (op.equals("delete")) {

                array[i-1] = "";

            } else if (op.equals("edit")) {

               array [i-1] = array [i-1].replace(word , data);

            } else if (op.equals("none")){
                array [i-1] = array[ i-1 ];}


        System.out.println(result);

             for (int k=0 ; k<array.length ; k++)
                 if (k==0)
                 result = array[0] ;
                 else if (k == i-1)
                 result += "#"+ array[i-1];
                 else
                  result+= "#" +array [k];

        return result;
    }

    public static void main(String[] args){


        System.out.println(lameDb("1etsy#2wooden#3spoon","add","3","aaa"));


    }


    }