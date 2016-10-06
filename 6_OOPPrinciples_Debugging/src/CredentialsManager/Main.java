
package CredentialsManager;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        
        switch(command)
        {
            case "ENROLL": 
                String user = sc.nextLine();
                String password = sc.nextLine();
                if(!Credentials.userExist(user))
                {
                Credentials User = new Credentials(user,password); 
                User.savePassword(password);
                }
                else
                {
                    System.out.println("fail");
                }
            case "CHPASS":
                
            case "AUTH": 
                        
        }
    }
    
}
