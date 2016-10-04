package PersonCharacteristics;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Person {

    //fields set to private
    private char gender;
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private double weightKg;
    private int heightCm;
    private String profession;
    private int age;
    
    private double average;
    
    //empty constructor removed
    Person(char gender, String firstName, String lastName, int yearOfBirth, double weightKg, int age, int heightCm, String profession, double average)
    {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.weightKg = weightKg;
        this.heightCm = heightCm;
        this.age = age;
        this.profession = profession;
        this.average = average;        
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
    int getYearOfBirth()
    {
        return yearOfBirth;
    }
    double getWeightKg()
    {
        return weightKg;
    }
    int getHeightCm()
    {
        return heightCm;
    }
    int getAge()
    {
        return age;
    }
    String getProfession()
    {
        return profession;
    }
    double getAverage()
    {
        return average;
    }
}
