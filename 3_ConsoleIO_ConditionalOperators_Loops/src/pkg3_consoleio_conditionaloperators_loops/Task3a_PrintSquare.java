
package pkg3_consoleio_conditionaloperators_loops;

import java.util.Scanner;

public class Task3a_PrintSquare {
    
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter numer");
        int count = sc.nextInt();
        int initialValue = count;
        
       while(count>0)
       {
               if(count==initialValue ^ count==1)
               {
                   for(int k = initialValue; k > 0; k--)
                   {
                       System.out.print("* ");
                   }
               }
               else
               {
                   for(int m = initialValue; m > 0; m--)
                   {
                       if(m==initialValue || m==1)
                       {
                           System.out.print("* ");
                       }
                       else
                       {
                           System.out.print("  ");
                       }
                   }
               }
               
               System.out.println();
               count--;
       }
}
}
