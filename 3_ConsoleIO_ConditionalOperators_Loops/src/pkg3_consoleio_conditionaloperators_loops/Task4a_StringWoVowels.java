
package pkg3_consoleio_conditionaloperators_loops;

import java.util.Scanner;

public class Task4a_StringWoVowels {

public static void main(String[] args)
{
        
        String s = "Peter loves dogs";
    
        for(int j = 0; j < s.length(); j++)
        {
            
        switch(s.charAt(j)){
            case 97: j+=1;break;
            case 101: j+=1;break;
            case 105: j+=1;break;
            case 111: j+=1;break;
            case 117: j+=1;break;
            
        }
            System.out.print(s.charAt(j));
        }
}


}
