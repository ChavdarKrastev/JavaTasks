
package BankManagement;


public class Account {
    
    private String name;
    private long govid;
    private double balance;
    Credentials login;
    
    Account (String name, long govid, String username, String password)
    {
        this.name = name;
        this.govid = govid;
        this.login = new Credentials(username, password);
    }
    
    void deposit(double amount)
    {
        this.balance += amount;
    }
    
    void withdraw(double amount)
    {
        if(amount>this.balance)
        {
            System.out.println("fail");
        }
        else
        {
        this.balance -= amount;
        }
    }
    
    double getBalance()
    {
        return balance;
    }
    
    boolean hasAccess(String password)
    {
      return login.checkPassword(password);
    }
    
    String getUsername()
    {
        return login.getUsername();
    }
    
    long getGovId()
    {
        return this.govid;
    }
    String getName()
    {
        return this.name;
    }
    
}
