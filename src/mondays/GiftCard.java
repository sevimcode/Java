//Imagine that you have won a $100 gift certificate in a contest.
//        You must spend the money in a particular store, but you can buy at most only three items.
//        The store's computer tracks the amount of money you have left to spend as well as the number of items you have bought.
//        Each time you choose an item, the computer will tell you whether you can buy it.
//        We want to write a program for the computer so that both the dollar amount available and the number
//        of items you can buy are easily changed. So, you will continue buying as long as
//        you have enough money and have bought fewer than three times.
//
//        You may buy up to 3 items costing no more than $100
//





        package mondays;



import java.util.Scanner;

public class GiftCard{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        int sum = 0;
        int money = 100;
        int cost = 0;
        int count = 0;


        while ( count != 3 ) {

            System.out.println("Enter cost of item:");
            cost = input.nextInt();
            money = money - cost;
            sum += cost;
            count++;
            if (sum < 100 && count != 3) {
                System.out.println("You spent $" + sum + " so far");

                System.out.println("You may buy up to " + ( 3 - count ) + " items");
            }

            if (sum > 100 && count != 3) {
                System.out.println("You can't spend more than $100");
                sum = sum - cost;
            }

            if (sum < 100 && count == 3) {
                System.out.println("You bought 3 items, spent $" + sum + " and done shopping");
                break;
            }

            if (sum == 100 && count == 3) {
                System.out.println("You bought 3 items, spent $100 and done shopping");
                break;
            }

        }

        System.out.println();

    }}













//        }
//
//        System.out.println(sum +", spent $100 and done shopping");


















