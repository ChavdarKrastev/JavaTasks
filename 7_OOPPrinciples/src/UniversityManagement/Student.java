package UniversityManagement;

class Student extends Person{
    
    String facultyNumber;
    String[] subjects;
    static Student[] students = new Student[500];
    static int counter = 0;
    
    Student(String name, String number, int tolerance,String facultyNumber, String[] subjects)
    {
        super(name,number,tolerance);
        this.subjects = subjects;
        this.facultyNumber = facultyNumber;
    }
   
    @Override
    void work(University obj) {
        for (int i = 0; i < 500; i++) {
            if (Student.students[i] != null) {
                Student.students[i].setTolerance(Student.students[i].getTolerance() + 2);
            } else if (MaintenanceEmployee.maintenance[i]!= null) {
                MaintenanceEmployee.maintenance[i].setTolerance(MaintenanceEmployee.maintenance[i].getTolerance()-1);
            } 
        } 
        obj.setBalance(obj.getBalance()-19);
    }
}