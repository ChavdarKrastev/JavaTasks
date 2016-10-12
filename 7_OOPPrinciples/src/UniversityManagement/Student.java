package UniversityManagement;

class Student extends Person{
    
    String facultyNumber;
    String[] subjects;
    static Student[] students = new Student[500];
    
    Student(String name, String number, int tolerance,String facultyNumber, String[] subjects)
    {
        super(name,number,tolerance);
        this.subjects = subjects;
        this.facultyNumber = facultyNumber;
    }
   
    @Override
    void work()
    {
       
    } 
}