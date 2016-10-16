
package Task2_FileStructure;

import java.util.Scanner;

public class FileStructure {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String[] splittedBySpace;
        splittedBySpace = str.split(" ");

//        if(splittedBySpace[0].equals("mkdir"))
//        {
//            FileSystemObject fileSystem = new FileSystemObject();
//        }
        switch(splittedBySpace[0])
        {
            case "mkdir":
               //FolderObject folder = new FolderObject(splittedBySpace[1]);
            case "touch":
        }
    }
    
}
