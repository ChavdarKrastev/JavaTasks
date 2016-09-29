
package pkg3_consoleio_conditionaloperators_loops;

import java.util.Scanner;

public class Task3c_PrintChristmasTree {
    
     public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numer");
        int count = sc.nextInt();
        int initialValue = count;
        
                   for(int k = 0; k < initialValue-2; k++)
                   {
                       for(int p=0; p<= initialValue*2-1;p++)
                       {
                           
                        if((p>=initialValue-k&&p<=initialValue+k))
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                       }
                       System.out.println();
                   }
                   
                   for(int j = 0; j < 2; j++)
                   {    
                        for(int i = 0; i <= initialValue*2-1; i++)
                        {
                            
                           if((i>=initialValue-j&&i<=initialValue+j))
                           {
                               System.out.print("*");
                           }
                           
                           else
                           {
                               System.out.print(" ");
                           }
                        }  
                        System.out.println();
                   }
               
 } 
      
                                }

