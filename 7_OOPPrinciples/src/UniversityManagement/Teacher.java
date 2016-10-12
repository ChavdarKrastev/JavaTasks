
package UniversityManagement;

public class Teacher extends Employee{
    
    String[] subjects;
    static Teacher[] teachers = new Teacher[500]; 
     public Teacher(String name, String phone, int tolerance, int salary) {
        super(name, phone, tolerance, salary);
        this.subjects = subjects;
    }
    
    void work()
    {
        
    }
    
}
