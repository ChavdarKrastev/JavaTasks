
package pkg3_consoleio_conditionaloperators_loops;

import java.util.Scanner;

public class Task2a_PrintSumOfN {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numers count");
        int count = sc.nextInt();
        int[] numbers = new int[count];
        System.out.println("Enter"+ count+ "numbers");
        for(int i =0; i < count; i++)
        {
            numbers[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int el:numbers)
        {
            sum+=el;
        }
        System.out.print(sum);
    }
    
    
}
