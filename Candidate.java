
/**
 * Write a description of class Candidate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Candidate{
    
    private String name;
    private Vote vote;
    private int numberOfCandidates;
    
    
    /**
     * Constructor for objects of class Candidate
     */
    public Candidate(){
        
    }
    
    public Candidate(String name,Vote vote){
        this.name = name;
        this.vote = vote;
    }

    public String getName(){
        return name;
    }
    
    public Vote getVote() {
        return vote;
    }
    
    public int getNumberOfCandidates(){
        return numberOfCandidates;
    }
}