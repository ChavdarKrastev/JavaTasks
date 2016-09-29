
package pkg3_consoleio_conditionaloperators_loops;

public class Task4c_PrintEverySentence {

    public static void main(String[] args)
    {
        String s = "Peter loves dogs. He doesn’t like cats.?! Maria likes cats. ";
       
                
        for(int j = 0; j < s.length(); j++)
        {
            
       if((j>2)&&(s.charAt(j-2)==33^s.charAt(j-2)==46^s.charAt(j-2)==63)&&(s.charAt(j-1)==32))
        {
            System.out.println();
        }
    System.out.print(s.charAt(j));
        }
    }
}