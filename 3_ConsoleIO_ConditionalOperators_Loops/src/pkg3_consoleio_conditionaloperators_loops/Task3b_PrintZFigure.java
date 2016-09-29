
package pkg3_consoleio_conditionaloperators_loops;

import java.util.Scanner;

public class Task3b_PrintZFigure {
    
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
                   for(int m = 1; m <= initialValue; m++)
                   {
                       if(m==count)
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
