package UniversityManagement;

abstract class Person {
    
    private String name;
    private String phone;
    private int tolerance;
    
    Person(String name, String phone, int tolerance)
    {
        this.name = name;
        this.phone = phone;
        this.tolerance = tolerance;
      
    }
    
    abstract void work(University obj);
    
    String getName()
    {
        
        return this.name;
    }
    
    int getTolerance()
    {
        return this.tolerance;
    }
    
    void setTolerance(int tolerance)
    {
        this.tolerance=tolerance;
    }
    
}