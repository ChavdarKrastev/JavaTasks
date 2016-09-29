
package pkg3_consoleio_conditionaloperators_loops;

import java.util.Scanner;


public class Task4d_SumOfNumbersInString {
    
     public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words and numbers");
        String s = sc.nextLine();
        
        char[] charArr = s.toCharArray();
        int sum = 0;
        
        for(int i = 0;i < charArr.length; i++)
        {
            if((i<charArr.length-1)&&((charArr[i]>=48)&&(charArr[i]<=57))&&((charArr[i+1]>=48)&&(charArr[i+1]<=57)))
            {
        //this makes array of type int if two or more char-numbers are found        
                     int[] arr = new int[charArr.length-i];
                     int k = 0;
                     while(((k+i)<charArr.length)&&(charArr[k+i]>=48)&&(charArr[k+i]<=57))
                     {
                         arr[k] = charArr[k+i]-48;
                         k++;    
                     }
                     i+=k;
                             
        //below is the logic that makes elements of an array in one number  
        
                     int position = 0;
                     for (int y = 0; y < k; y++)
                     {
                                int multiplier = 1;
                                for (int m = k - y; m > 1; m--)
                                {
                                    multiplier *= 10;
                                }
                               
                                position = arr[y]*multiplier;
                                sum += position;
                     }
            }
                               
            else if ((i<charArr.length-1)&&((charArr[i]>=48)&&(charArr[i]<=57))&&((charArr[i+1]<48)^(charArr[i+1]>57)))
            {
              sum += charArr[i] - 48;      
            }           
                   
            else if (((charArr[i]>=48)&&(charArr[i]<=57))&&((charArr[i-1]<48)^(charArr[i-1]>57)))
            {
                sum += charArr[i] - 48;
            }
        } 
        System.out.print(sum);
}
                                            }
                       
                      