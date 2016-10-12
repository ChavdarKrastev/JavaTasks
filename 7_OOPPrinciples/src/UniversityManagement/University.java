package UniversityManagement;

public class University {

private int balance;
static Person[] individuals = new Person[500];

University(int balance)
{
    this.balance = balance;
}
    
int getBalance()
{
    return this.balance;
}

void setBalance(int balance)
{
    this.balance=balance;
}

}