package arrays;

public class MissingNumber2{


        public static void main( String[] args ) {
            int[] arr = { 3 , 4 , 5 , 6 , 10 , 15 };
            // print  missing  numbers
            findNumber(arr);
        }

        public static void findNumber( int[] num ) {
            for (int i = num[0];i < num[ num.length - 1 ];i++) {
                boolean b = false;
                for (int j = 0;j < num.length;j++) {
                    if (num[ j ] == i) {
                        b = true;
                    }
                }
                if (b != true) {
                    System.out.println("Missing Number is :" + i);
                }
            }
        }
    }

