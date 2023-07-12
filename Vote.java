
/**
 * Write a description of class Vote here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vote{
    // instance variables - replace the example below with your own
    private int count;

    /**
     * Constructor for objects of class Vote
     */
    public Vote(){
    }
    
    public Vote(int count){
        this.count = count;
    }

    public int getCount (){
       return count;
    }
    
    public void setCount (int count){
        this.count = count;
    }
    
    public void clear (){
        count = 0;
    }   
    
    public void increment(){
        count++;
    }
    
    public void decrement(){
        count--;
    }
}   
