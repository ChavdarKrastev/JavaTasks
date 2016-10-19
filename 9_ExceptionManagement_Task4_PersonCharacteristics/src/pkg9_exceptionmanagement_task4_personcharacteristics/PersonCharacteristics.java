package pkg9_exceptionmanagement_task4_personcharacteristics;

import pkg9_exceptionmanagement_task4_personcharacteristics.education.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PersonCharacteristics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
    try
    {
                Person person = readPerson(sc.nextLine());
                System.out.println(person);
            }
    catch(FieldsCheckException ex)
    {
        System.out.println(ex);
    }
        }

    }

    private static Person readPerson(String data) throws FieldsCheckException {

        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");

        String[] split = data.split(";");

        String firstName = split[0];
        String middleName = split[1];
        String lastName = split[2];
        char gender = Character.toUpperCase(split[3].toCharArray()[0]);
        LocalDate dateOfBirth = LocalDate.parse(split[4].trim(), formatter);
        short height = Short.parseShort(split[5].trim());

        String country = split[6];
        String city = split[7];
        String municipality = split[8];
        String postalCode = split[9];
        String street = split[10];
        String streetNumber = split[11];
        String floor = split[12];
        String appartment = split[13];

        Address address = new Address(country, city, municipality, postalCode, street, streetNumber, floor, appartment);

        String degree = split[14].trim();
        String institutionName = split[15].trim();
        LocalDate enrollmentDate = LocalDate.parse(split[16].trim(), formatter);
        LocalDate graduationDate = LocalDate.parse(split[17].trim(), formatter);

        Education education;
        if (degree.equalsIgnoreCase("P")) {
            education = new PrimaryEducation(institutionName, enrollmentDate, graduationDate);
        } else if (degree.equalsIgnoreCase("S")) {
            education = new SecondaryEducation(institutionName, enrollmentDate, graduationDate);
        } else {
            education = new HigherEducation(institutionName, enrollmentDate, graduationDate, degree);
        }
        if (graduationDate.isBefore(LocalDate.now())) {
            ((GradedEducation) education).gotGraduated(Float.parseFloat(split[18].trim()));
        }
        
        education.checkGraduationDate(graduationDate);
        
        Person person = new Person(firstName, middleName, lastName, gender, height, dateOfBirth);
        person.addAddress(address);
        person.addEducation(education);

        return person;

    }
}