
package pkg3_consoleio_conditionaloperators_loops;

import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divider = 10;
        while (num > divider)
        {
            num = num / divider;
        }
        System.out.println(num);
    }

                                    }
