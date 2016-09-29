
package pkg3_consoleio_conditionaloperators_loops;

import java.util.Scanner;

public class Task1e_IsPrime {
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        
        for(int i = 2; i <= number/2; i++)

        {
            if(number%i==0)
            {
                System.out.print("false");
                break;
            }
            if((i==number/2)&&(number%i!=0))
            {
                System.out.print("true");
            }
        }
        
                
    }
    
                        }
