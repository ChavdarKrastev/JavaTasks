package PersonCharacteristics;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Person {

    char gender;
    String firstName;
    String lastName;
    int yearOfBirth;
    double weightKg;
    short heightCm;
    String profession;
    int age;
    
    double[] marks;
    double average = 0;
    
    
    
    Person()
    {}
    
    Person(char gender, String firstName, String lastName, int yearOfBirth, double weightKg, int age, short heightCm, String profession, double average)
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

    Scanner sc = new Scanner(System.in);

    void initialize() {
        System.out.println("gender");
        String gen = sc.nextLine();
        gender = gen.charAt(0);

        System.out.println("first name");
        firstName = sc.nextLine();

        System.out.println("last name");
        lastName = sc.nextLine();

        System.out.println("year of birth");
        String birthYear = sc.nextLine();
        yearOfBirth = Integer.parseInt(birthYear);
        
        LocalDateTime timePoint = LocalDateTime.now();
        int currentYear = timePoint.getYear();
        age = currentYear - yearOfBirth;

        System.out.println("Enter weight in kg");
        String weight = sc.nextLine();
        weightKg = Double.parseDouble(weight);

        System.out.println("Enter height in cm");
        String height = sc.nextLine();
        heightCm = Short.parseShort(height);

        System.out.println("Enter profession");
        String profession = sc.nextLine();

        System.out.println("Enter 4 marks between 2 and 6");
        double[] marks = new double[4];
        
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("mark %d - ", (i + 1));
            String str = sc.nextLine();
            double j = Double.parseDouble(str);
            marks[i] = j;
            average += marks[i];
        }
        average = average / marks.length;
    }  
}
