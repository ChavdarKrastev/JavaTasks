package UniversityManagement;

public class Teacher extends Employee{
    
    String[] subjects;
    static Teacher[] teachers = new Teacher[500]; 
    static int counter = 0;
    
     public Teacher(String name, String phone, int tolerance,String[] subj ) {
        super(name, phone, tolerance);
        this.subjects = subjects;
    }
    
     void work(University obj) {
        for (int i = 0; i < 500; i++) {
            if (Student.students[i] != null) {
                Student.students[i].setTolerance(Student.students[i].getTolerance() + 3);
            } else if (MaintenanceEmployee.maintenance[i]!= null) {
                MaintenanceEmployee.maintenance[i].setTolerance(MaintenanceEmployee.maintenance[i].getTolerance()-3);
            } 
            else if (AdministrationEmployee.admins[i]!= null) {
                AdministrationEmployee.admins[i].setTolerance(AdministrationEmployee.admins[i].getTolerance()-1);
            }
        } 
        this.salaryPerHour+=25;
        obj.setBalance(obj.getBalance()-25);
    }
    
}
