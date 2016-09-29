
package pkg3_consoleio_conditionaloperators_loops;

import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    
    public static void main(String[] args)
{
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter numers count");
        int count = sc.nextInt();
        int[] numbers = new int[count];
        System.out.println("Enter "+ count+ " numbers");
        for(int i =0; i < count; i++)
        {
            numbers[i] = sc.nextInt();
        }
   
        for(int el:numbers)
        {
            if(el%2==0)
            {
                System.out.print(el);
            }
        }
}
}