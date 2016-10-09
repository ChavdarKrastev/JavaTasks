/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonCharacteristics;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    static LocalDate stringToDate(String date) {
        String[] splittedByDots = date.split("\\.");
        int year = Integer.parseInt(splittedByDots[2]);
        int month = Integer.parseInt(splittedByDots[1]);
        int day = Integer.parseInt(splittedByDots[0]);
        LocalDate Date = LocalDate.of(year, month, day);
        return Date;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String person = sc.nextLine();
        int per = Integer.parseInt(person);

        Person[] persons = new Person[per];
        for (int i = 0; i < per; i++) {

            String data = sc.nextLine();
            String[] splitted;
            splitted = data.split(";");
            String firstName = splitted[0];
            String lastName = splitted[1];
            char gender = splitted[2].charAt(0);

            String height = splitted[3];
            int heightCm = Integer.parseInt(height);

            LocalDate dateOfBirth = stringToDate(splitted[4]);

            LocalDate timePoint = LocalDate.now();
            int currentYear = timePoint.getYear();
            int age = currentYear - dateOfBirth.getYear();

            String institution = splitted[5];

            LocalDate enrollmentDate = stringToDate(splitted[6]);

            LocalDate graduationDate = stringToDate(splitted[7]);

            double grade = -1;

            if (splitted.length == 9) {
                grade = Double.parseDouble(splitted[8]);
            }

            SecondaryEducation education = new SecondaryEducation(grade, enrollmentDate, graduationDate, institution);

            Person individual = new Person(gender, firstName, lastName, dateOfBirth, age, heightCm, education);
            persons[i] = individual;
        }

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getGender() == 'F') {
                if (persons[i].secondary.getGraduated()) {
                    String f = persons[i].getFirstName() + " " + persons[i].getLastName() + " is " + persons[i].getAge() + " years old. She was born in " + persons[i].getDateOfBirth().getYear() + ". She started " + persons[i].secondary.getInstitution() + " on " + persons[i].secondary.getEnrollment() + " and is supposed to graduate on " + persons[i].secondary.getGraduation();
                    if (persons[i].getAge() < 17) {
                        String u = persons[i].getFirstName() + " " + persons[i].getLastName() + " is under-aged";
                        System.out.println(f + u);
                    } else {
                        System.out.println(f);
                    }
                    System.out.println(f);
                } else {
                    String f = persons[i].getFirstName() + " " + persons[i].getLastName() + " is " + persons[i].getAge() + " years old. She was born in " + persons[i].getDateOfBirth().getYear() + ". She started " + persons[i].secondary.getInstitution() + " on " + persons[i].secondary.getEnrollment() + " and finished on " + persons[i].secondary.getGraduation() + " with a grade of " + persons[i].secondary.getGrade() + "0.";
                    System.out.println(f);
                }
            } else if (persons[i].getGender() == 'M') {
                if (persons[i].secondary.getGraduated()) {
                    String m = persons[i].getFirstName() + " " + persons[i].getLastName() + " is " + persons[i].getAge() + " years old. He was born in " + persons[i].getDateOfBirth().getYear() + ". He started " + persons[i].secondary.getInstitution() + " on " + persons[i].secondary.getEnrollment() + " and is supposed to graduate on " + persons[i].secondary.getGraduation() + ". ";
                    if (persons[i].getAge() < 17) {
                        String u = persons[i].getFirstName() + " " + persons[i].getLastName() + " is under-aged";
                        System.out.println(m + u);
                    } else {
                        System.out.println(m);
                    }
                } else {
                    String m = persons[i].getFirstName() + " " + persons[i].getLastName() + " is " + persons[i].getAge() + " years old. He was born in " + persons[i].getDateOfBirth().getYear() + ". He started " + persons[i].secondary.getInstitution() + " on " + persons[i].secondary.getEnrollment() + " and finished on " + persons[i].secondary.getGraduation() + " with a grade of " + persons[i].secondary.getGrade() + "0.";
                    System.out.println(m);
                }
            }
        }
    }
}
