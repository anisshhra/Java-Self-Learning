
/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Account
{
    int id;
    double balance;
    double amount;
    

    
    Account()
    {
       
    }
    
    
    Account(int id, double balance)
    {
       this.id = id;
       this.balance = balance;
    }
    
    
   
    double getWithdraw (double amount)
    {
        
       balance = balance - amount;
       return balance;
    }
    
    double getDeposit (double amount)
    {
        balance = balance + amount;
        return balance;
    }
    
    
}
