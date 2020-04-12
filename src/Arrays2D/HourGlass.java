package Arrays2D;


import java.util.Arrays;

public class HourGlass{

    public static void main(String[] args){
       int biggest=0;
       int index=0;
       int k=0;
        int [] [] a = {{2,2,2,2,2},{3,2,315,5,7},{2,4,2,2,2},{3,2,3,5,7},{2,7,2,2,2}};
        for (int i=0; i<a.length ; i++)
            System.out.println(Arrays.toString(a[i]));

        int[] sum = new int [(a.length-2)*(a.length-2)+1];


            for (int i=0; i< a.length-2 ; i++) {

                for (int j=0; j< a.length-2 ; j++) {
                k++;


            sum[k] = a[i+1][j+1]  + a[i][j]+a[i][j+1]+a[i][j+2] +  a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];


                if (sum[k]>biggest){
                biggest=sum[k];
                index=k;}



        }

            }

        System.out.println(biggest);
        System.out.println(index);

        int counter =1;
        for (int i=1; i< a.length-1 ; i++) {

            for (int j=1; j< a.length-1 ; j++) {

                 if (index==counter)
                System.out.println("(" +i + "," + j + ")");

            counter++;
            }}


    }






    }







