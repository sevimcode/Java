package methodoverloading;


import methods.RandomArrayMethod;

public class AddingArrayelements{

    public static int addArrayElements (int ... arr){
        int result = 0;


        for (int i = 0;i < arr.length;i++) {

            if (arr[ i ] % 10 != 5) {
                result = result + arr[ i ];
            }
        }
        return result;
    }

    public static int addArrayElements(int num, int [] array){ // if you want to use varargs here it will complain

        int result = 0;


        for (int i = 0;i < array.length;i++) {

            if (array[ i ] % 10 != num) {
                result = result + array[ i ];
            }
        }
        return result;
    }



    public static void main(String[] args){


        System.out.println( addArrayElements(2,2,4,115,2,2));

        int [] array1 = RandomArrayMethod.randomArray(7, 50); // creating random array from our previous code
        int [] a = {2,3,4,5,5};

        System.out.println( addArrayElements(2,array1));
    }



}
