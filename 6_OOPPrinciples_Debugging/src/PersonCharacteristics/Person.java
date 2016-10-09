package PersonCharacteristics;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {

    //fields set to private
    private char gender;
    private String firstName;
    private String lastName;
    LocalDate dateOfBirth;
    private double weightKg;
    private int heightCm;
    private String profession;
    private int age;
    SecondaryEducation secondary;
    
        Person(char gender, String firstName, String lastName, LocalDate dateOfBirth, int age, int heightCm, SecondaryEducation secondary)
    {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.heightCm = heightCm;
        this.age = age;
        this.secondary = secondary;
      
    }

    char getGender()
    {
        return gender;   
    }
    String getFirstName()
    {
        return firstName;
    }
    String getLastName()
    {
        return lastName;
    }
    LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }
    void setDateOfBirth(LocalDate date)
    {
        this.dateOfBirth = date;
    }
    int getHeightCm()
    {
        return heightCm;
    }
    int getAge()
    {
        return age;
    }
    
}
