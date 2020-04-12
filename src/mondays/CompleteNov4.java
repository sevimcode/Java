package mondays;

import java.util.Scanner;

public class CompleteNov4{



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            // TASK 1 finding repetitive characters number of occurrence

            System.out.println("Enter word:");
            String str = input.next().toLowerCase();

            String checked= "";

            for (int i = 0 ; i< str.length() ; i++ )
            {
                int count = 0;

                if (!checked.contains(str.charAt(i)+""))
                {

                    for (int j = 0; j < str.length (); j++)
                    {

                        if (str.charAt ( i ) == str.charAt ( j ))
                        {
                            count++;
                        }

                    }


                    checked += str.charAt ( i ) + "";
                    if (i==0){
                        System.out.print (str.charAt(i)+":" + count); }

                    else{
                        System.out.print (" "+str.charAt(i)+":" + count);}
                }

            }

            System.out.println();

           //TASK 2 $100 giftcard puchase and find how many can you purchase calculate sum


            int sum = 0;
            int money = 100;
            int cost = 0;
            int count = 0;


            while (count!=3){

                System.out.println("Enter cost of item:");
                cost = input.nextInt();
                money = money - cost;
                sum += cost;
                count++;
                if (sum<100 && count!=3 ){
                    System.out.println("You spent $" + sum + " so far");

                    System.out.println("You may buy up to " + ( 3 - count ) + " items");}


                if (sum > 100 && count !=3) {
                    System.out.println("You can't spend more than $100");
                    sum = sum-cost;
                    count--;
                }

                if (sum<100 && count==3) {
                    System.out.println("You bought 3 items, spent $" + sum + " and done shopping");
                    break;}

                if (sum == 100) {
                    System.out.println("You bought " + count + "items, spent $100 and done shopping");
                    break;}

            }

            System.out.println();




         //TASK 3 finding only once occurence characters


            int[] array = { 5 , 7 , 8 , 8 , 11 , 55 , 23 , 23 , 23 , 54 , 7 , 1 , 2 , 2 };

            for (int i = 0 ; i< array.length ; i++ )
            {
                int count2 = 0;


                for (int j = 0; j < array.length; j++)
                {

                    if (array[i] == array[j])
                    {
                        count2++;

                    }

                }

                if (count2==1)
                    System.out.print (array[i]+" ");

            }




        }
    }







