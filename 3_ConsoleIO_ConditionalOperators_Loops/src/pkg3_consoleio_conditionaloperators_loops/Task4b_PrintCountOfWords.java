
package pkg3_consoleio_conditionaloperators_loops;

public class Task4b_PrintCountOfWords {
 
    public static void main(String[] args)
{
    String s = "Peter loves dogs. He doesn’t like cats.";
    int words = 1;
            
    for(int j = 0; j < s.length(); j++)
        {
            if(s.charAt(j)==32)    
            {
                words+=1;
            }
        }
    System.out.print(words);
}
    
}

