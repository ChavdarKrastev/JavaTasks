package UniversityManagement;

abstract class Employee extends Person{
    
    int salaryPerHour;
    
    public Employee(String name, String phone, int tolerance) {
        super(name, phone, tolerance);
        //this.salaryPerHour = salary;
    }
}