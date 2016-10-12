package UniversityManagement;

public class AdministrationEmployee extends Employee{

    String[] subjects;
    static AdministrationEmployee[] admins = new AdministrationEmployee[500];
    
    public AdministrationEmployee(String name, String phone, int tolerance, int salary) {
        super(name, phone, tolerance, salary);
        this.subjects = subjects;
    }
    
    @Override
    void work()
    {
       
    } 
    
}