
package pkg3_consoleio_conditionaloperators_loops;

import java.util.Scanner;


public class Task1f_ToBinaryAndHexa {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        
        byte[] reversedBinary = new byte[31];
        String[] reversedHexa = new String[9];
        int i = 0;
        int numberToHexa = number;
        int h = 0;

//decimal to binary logic        
        while (number >=1)
        {
            if (number%2==0)
            {
                reversedBinary[i] = 0;
            }
            if (number%2!=0)
            {
                reversedBinary[i] = 1;
            }
            number/=2;
            i++;
        }
        
        while(i>0)
        {
            i--;
            System.out.print(reversedBinary[i]);  
        }
        
        System.out.println();
       
//decimal to hexadecimal logic      
        while(numberToHexa>0)
        {         
            if(numberToHexa%16<10)
            {
            reversedHexa[h] = Integer.toString(numberToHexa%16);
            }
            if(numberToHexa%16>9)
            {
                switch(numberToHexa%16)
                {
                    case 10: reversedHexa[h] = "A";break;
                    case 11: reversedHexa[h] = "B";break;
                    case 12: reversedHexa[h] = "C";break;
                    case 13: reversedHexa[h] = "D";break;
                    case 14: reversedHexa[h] = "E";break;
                    case 15: reversedHexa[h] = "F";break;
                }
            }
            numberToHexa/=16;
            h++;
        }
        
        while(h>0)
        {
            h--;
            System.out.print(reversedHexa[h]);  
        }
        
        System.out.println();  
    }
}
