package BankManagement;

public class Bank {

    private Account account;
    private double assets;

    Account[] accounts = new Account[200];
    int accountIndex = 0;

    void openAccount(String name, int govid, String username, String password) {
        account = new Account(name, govid, username, password);
        accounts[accountIndex] = account;
        if (accountIndex == 200) {
            accountIndex = 0;
        }
    }

    void closeAccount(String username, String password) {
        if ((this.account.login.getUsername().equals(username)) && (this.account.login.checkPassword(password))) {
            account = null;
        }
    }

    void deposit(String username, double amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                if (accounts[i].login.getUsername().equals(username)) {
                    accounts[i].deposit(amount);
                    break;
                }
            }
        }
    }

    void withdraw(String username, String password, double amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                if (accounts[i].login.getUsername().equals(username) && (accounts[i].login.checkPassword(password))) {
                    if (accounts[i].getBalance() > amount) {
                        accounts[i].withdraw(amount);
                    }
                }
            }
        }
    }

    void transfer(String username, String password, double amount, String recipient) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                if (accounts[i].login.getUsername().equals(username) && (accounts[i].login.checkPassword(password))) {
                    if (accounts[i].getBalance() > amount) {
                        accounts[i].withdraw(amount);
                        for (int j = 0; j < accounts.length; j++) {
                            if (accounts[j] != null) {
                                if (accounts[j].login.getUsername().equals(recipient)) {
                                    accounts[j].deposit(amount);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    double getAssets() {
        double total = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                total += accounts[i].getBalance();
            }
        }
        return total;
    }
}
