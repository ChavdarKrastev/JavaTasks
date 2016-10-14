package UniversityManagement;

public class MaintenanceEmployee extends Employee{
    
    static MaintenanceEmployee[] maintenance = new MaintenanceEmployee[500];
    static int counter = 0;
    
    public MaintenanceEmployee(String name, String phone, int tolerance) {
        super(name, phone, tolerance);
    }
     
    void work(University obj) {
        for (int i = 0; i < 500; i++) {
            if (Student.students[i] != null) {
                Student.students[i].setTolerance(Student.students[i].getTolerance() + 2);
            } else if (AdministrationEmployee.admins[i]!= null) {
                AdministrationEmployee.admins[i].setTolerance(AdministrationEmployee.admins[i].getTolerance()+2);
            } else if (Teacher.teachers[i]!= null) {
                Teacher.teachers[i].setTolerance(Teacher.teachers[i].getTolerance() +2);
            }
        } 
        this.salaryPerHour += 15;
        obj.setBalance(obj.getBalance()-19);
    }
    
}