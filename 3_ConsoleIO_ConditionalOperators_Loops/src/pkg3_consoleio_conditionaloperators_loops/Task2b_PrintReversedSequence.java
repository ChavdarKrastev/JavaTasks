
package pkg3_consoleio_conditionaloperators_loops;

import java.util.Scanner;

public class Task2b_PrintReversedSequence {

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
        
        while(count>0)
        {
            count--;
            System.out.print(numbers[count]);
        }
    
}
    
}
