
/**
 * Write a description of class TestStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class TestStudent{
    public static void main (String [] args ){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter number of student");
        int no = input.nextInt();
        
        Student [] std = new Student [no];
        
        System.out.println("Enter the required information");
   
        
        for (int i = 0; i < no; i++){
            
        std [i] = new Student();
        System.out.println("Student " + (i+1));
        System.out.print("Student's id : ");
        std[i].setIdStudent(input.nextInt());
        System.out.print("Name : ");
        std[i].setName(input.next());
        System.out.print("Department : ");
        std[i].setDepartment(input.next());
        System.out.print("Classification : ");
        std[i].setClassification(input.next());
        
    }
    
    
    System.out.println("\t Id Student \t\t Name \t\t Department \t\t Classification");
    
      for (int i = 0; i < no; i++){
        
        System.out.println("\t " + std[i].getIdStudent() + " \t\t " + std[i].getName() + " \t\t " + std[i].getDepartment() + " \t\t " +std[i].getClassification());
        
    }
    
}
}
