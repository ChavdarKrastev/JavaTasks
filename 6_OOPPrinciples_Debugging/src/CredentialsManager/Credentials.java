package CredentialsManager;

public class Credentials {

    private String _username;
    private String _password;

    private String[] passwords = new String[100];

    String getUsername() {
        return _username;
    }

    private void setPassword(String password) {
        this._password = password;
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

    private void savePassword(String newPassword)
    {
        for(int i=0; i<passwords.length; i++)
        {
            if(passwords[i]!=null)
            {
                passwords[i] = newPassword;
            }
        }
    }
    
    public void changePassword(String oldPassword, String newPassword) {
        if (authentication(newPassword) == false) {
            if (checkPassword(oldPassword)) {
                setPassword(newPassword);
                savePassword(newPassword);
            } else {
                System.out.println("fail");
            }
        } else {
            System.out.println("fail");
        }
    }
}
