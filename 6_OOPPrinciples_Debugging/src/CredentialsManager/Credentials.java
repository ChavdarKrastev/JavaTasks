package CredentialsManager;

public class Credentials {

    private String _username;
    private String _password;
    
    private int passwordIndex;
    private String[] passwords = new String[100];
    
    static Credentials[] users = new Credentials[200];
    
    Credentials(String user, String password)
    {
        this._username = user;
        this._password = password;
    }
    
    private void setUsername(String username)
    {
        this._username = username;
    }

    String getUsername() {
        return _username;
    }

    private void setPassword(String password) {
        this._password = password;
    }

    private String getPassword()
    {
        return _password;
    }
    
    static boolean userExist (String user)
    {
        for(int i=0; i<users.length; i++)
        {
            if(users[i]._username.equals(user))
            {
                return true;
            }
        }
         return false;
    }
    
    private boolean authentication(String password) {
        for (int i = 0; i < passwords.length; i++) {
            if (passwords[i] == password) {
                return true;
            }
        }
        return false;
    }

    private boolean checkPassword(String password) {
        if (password == this._password) {
            return true;
        }
        return false;
    }

    void savePassword(String newPassword)
    {
        passwords[passwordIndex] = newPassword;
        setPassword(newPassword);
        passwordIndex++;
        if(passwordIndex==100)
        {
            passwordIndex = 0;
        }
    }
    
    void changePassword(String oldPassword, String newPassword) {
        if ((authentication(oldPassword))&&(! authentication(newPassword))) {
             savePassword(newPassword);
        }
             else {
                System.out.println("fail");
            }
        
    }
}
