
package UniversityManagement;

class Student extends Person{
    
    String facultyNumber;
    
    Student(String name, String number, int tolerance,String facultyNumber, String[] subjects)
    {
        super(name,number,tolerance, subjects);
        
        this.facultyNumber = facultyNumber;
    }
    
    
    void work(University university)
    {
        if(this.getTolerance()>=50)
        {
            university.setBalance(10);
        }
    }
    
}
