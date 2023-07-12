
/**
 * Write a description of class TestCandidate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class TestCandidate{
    public static void main (String [] args){
        
        Scanner input = new Scanner (System.in);
        int highest = 0;
        int reset;
        
        System.out.println("President Election for 2019");
        System.out.println("Number of candidates: 2 ");
        
        Candidate myCandidate1 = new Candidate();
        Candidate myCandidate2 = new Candidate();
        Vote count1 = new Vote();
        Vote count2 = new Vote();
        myCandidate1 = new Candidate("Jeremy", count1);
        myCandidate2 = new Candidate("Conan", count2);
        
        do{
        while(true){
            System.out.println("-----------------------------------------");
            System.out.println("Enter your vote");
            System.out.println(" 1 : Jeremy ");
            System.out.println(" 2 : Conan ");
            System.out.println(" -1 : Deducts a vote from Jeremy ");
            System.out.println(" -2 : Deducts a vote from Conan ");
            System.out.println(" 0 : End of voting ");
            int vote = input.nextInt();
            
            if (vote == 0) 
            break;
            if (vote == 1) 
            count1.increment();
            if (vote == 2) 
            count2.increment();
            if (vote == -1) 
            count1.decrement();
            if (vote == -2) 
            count2.decrement();
        }  
        
        System.out.println("--------------------------------------------------------------");
        System.out.println("Voting result");
        System.out.println();
        System.out.println("Number of vote for " + myCandidate1.getName() + " is " + count1.getCount());
        System.out.println("Number of vote for " + myCandidate2.getName() + " is " + count2.getCount());
        
        if (count1.getCount() > count2.getCount()){
            highest = count1.getCount();
            System.out.println(myCandidate1.getName() + " won the election");
            System.out.println(myCandidate1.getName() + " is the new president");
        }
        else {
            highest = count2.getCount();
            System.out.println(myCandidate2.getName() + " won the election");
            System.out.println(myCandidate2.getName() + " is the new president");
        }
        
        System.out.println("Enter 11 to reset the program");
        System.out.println("Enter 9 to quit the voting program");
        reset = input.nextInt();
        if (reset == 11){
            count1.clear();
            count2.clear();
        }

        
      } while (reset == 11);
}
}
