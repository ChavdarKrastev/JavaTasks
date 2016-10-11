
package UniversityManagement;

abstract class Person {
    
    private String name;
    private String phone;
    private int tolerance;
    static Person[] individuals = new Person[500];
    String[] subjects;
    
    Person(String name, String phone, int tolerance, String[] subjects)
    {
        this.name = name;
        this.phone = phone;
        this.tolerance = tolerance;
        this.subjects = subjects;
    }
    String getName()
    {
        return this.name;
    }
    
    int getTolerance()
    {
        return this.tolerance;
    }
    
    abstract void work();
    
}
