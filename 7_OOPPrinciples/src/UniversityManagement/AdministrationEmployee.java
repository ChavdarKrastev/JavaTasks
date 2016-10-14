package UniversityManagement;

public class AdministrationEmployee extends Employee{
static int counter = 0;

    String[] subjects;
    static AdministrationEmployee[] admins = new AdministrationEmployee[500];
    
    public AdministrationEmployee(String name, String phone, int tolerance, String[] subj) {
        super(name, phone, tolerance);
        this.subjects = subjects;
    }
    
    @Override
    void work(University obj) {
        for (int i = 0; i < 500; i++) {
            if (Student.students[i] != null) {
                Student.students[i].setTolerance(Student.students[i].getTolerance() + 3);
            } else if (MaintenanceEmployee.maintenance[i]!= null) {
                MaintenanceEmployee.maintenance[i].setTolerance(MaintenanceEmployee.maintenance[i].getTolerance()+3);
            } else if (Teacher.teachers[i]!= null) {
                Teacher.teachers[i].setTolerance(Teacher.teachers[i].getTolerance() +1);
            }
        } 
        this.salaryPerHour+=19;
        obj.setBalance(obj.getBalance()-19);
    }
    
     void setTolerance(int tolerance)
    {
        super.setTolerance(super.getTolerance()+tolerance);
    }
    int getTolerance()
    {
        return super.getTolerance();
    }
}