
package pkg3_consoleio_conditionaloperators_loops;

import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = 0;
        while(x > 1)
        {
            a = x % 10;
            System.out.print(a);
            x/=10;
        }
    }
}
