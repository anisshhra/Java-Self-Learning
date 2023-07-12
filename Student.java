
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student{
    
    int idStudent;
    String name;
    String department;
    String classification;


    Student(){
        idStudent = 0;
        name = " " ;
        department = " " ;
        classification = " ";
    }
    
    Student (int idStudent, String name,String department, String classification){
    
    this.idStudent = idStudent;
    this.name = name;
    this.department = department;
    this.classification = classification;
    
    }
    
    int getIdStudent(){
        
        return idStudent;
    }
    
    String getName(){
        
        return name;
    }
    
    String getDepartment(){
        
        return department;
    }
    
    String getClassification(){
        
        return classification;
    }
    
    void setIdStudent(int idStudent){
        
        this.idStudent = idStudent;
    }
    
    void setName(String name){
        
        this.name = name;
    }
    
    void setDepartment(String department){
        
        this.department = department;
    }
    
    void setClassification(String classification){
        
        this.classification = classification;
    }
}
