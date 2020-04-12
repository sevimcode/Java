package nestedloops;

import java.util.Scanner;

public class UniqueCharacter {


        public static void main ( String[] args ) {


            Scanner input = new Scanner ( System.in );
            int [] word= {input.nextInt (),input.nextInt (),input.nextInt (),input.nextInt (),input.nextInt ()};



            for (int i = 0 ; i< word.length ; i++ )
            {
                int count = 0;


                    for (int j = 0; j < word.length; j++)
                    {

                        if (word[i] == word[j])
                        {
                            count++;

                        }

                    }

                    if (count==1) // if we have one of the character prints, if you put count==2 print double character
                    System.out.println (word[i]);

            }

        }

    }





