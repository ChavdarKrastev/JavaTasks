
package pkg3_consoleio_conditionaloperators_loops;

import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
    
    public static void main (String[] args)
    {
     Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divider = 10;
        int a = 0;
        
        while(num > 1)
        {
            a += (num % divider);
            num = num/10;
        }
         System.out.print(a);
    }
}
