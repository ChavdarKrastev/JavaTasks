package UniversityManagement;

public class MaintenanceEmployee extends Employee{
    
    static MaintenanceEmployee[] maintenance = new MaintenanceEmployee[500];

    public MaintenanceEmployee(String name, String phone, int tolerance, int salary) {
        super(name, phone, tolerance,salary);
    }
     
    void work()
    {
        
    }
    
}