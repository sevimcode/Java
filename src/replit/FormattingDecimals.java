package replit;

import java.lang.*;

import java.util.Formatter;
import java.util.Scanner;

public class FormattingDecimals {


    public static void main ( String[] args ) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float sum=0;

//n=Integer.parseInt(s[0]);

        for(int i=1;i<=n;i++)
        {
            sum=sum+(float)1/i;
        }
        Formatter fmt = new Formatter();

        fmt = new Formatter();
        fmt.format("%.15f", sum);
        System.out.println(fmt);

    }
}





