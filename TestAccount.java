


/**
 * Write a description of class TestAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class TestAccount {
 public static void main (String[] args) {
     Scanner input = new Scanner (System.in);
     
     System.out.println("Welcome to Test Bank");
     
     System.out.println("How many account you want to create?");
     int user = input.nextInt();
     
     Account [] accArray = new Account[user];
     
     int i = 0;
     do {
         accArray[i] = new Account();
         
         System.out.println("User account : " + (i + 1));
         System.out.println("Id : " );
         int id = input.nextInt();
         
         System.out.println("Balance : ");
         double balance = input.nextDouble();
         
         accArray[i] = new Account (id, balance);
         
         System.out.println("Enter number");
         System.out.println(" Withdraw : 1 , Deposit : 2 ");
         int num = input.nextInt();
         
         switch(num) {
             case 1: {
                      System.out.println("Withdraw");
                      System.out.println("Enter amount to withdraw");
                      double withdraw = input.nextDouble();
                      System.out.println("Updated balance : " + accArray[i].getWithdraw(withdraw));
                      break;
                     }
             case 2: {
                      System.out.println("Deposit");
                      System.out.println("Enter amount to deposit");
                      double deposit = input.nextDouble();
                      System.out.println("Updated balance : " + accArray[i].getDeposit(deposit));
                      break;
                     }
             default : System.out.println("System Exit. Please enter a valid number");      
         }
         i++;
         } while (i < user);
}
}

