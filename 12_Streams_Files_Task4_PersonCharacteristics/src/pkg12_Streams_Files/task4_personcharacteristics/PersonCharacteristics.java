package pkg12_Streams_Files.task4_personcharacteristics;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import pkg12_Streams_Files.task4_personcharacteristics.education.PrimaryEducation;
import pkg12_Streams_Files.task4_personcharacteristics.education.GradedEducation;
import pkg12_Streams_Files.task4_personcharacteristics.education.FieldsCheckException;
import pkg12_Streams_Files.task4_personcharacteristics.education.HigherEducation;
import pkg12_Streams_Files.task4_personcharacteristics.education.Education;
import pkg12_Streams_Files.task4_personcharacteristics.education.SecondaryEducation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PersonCharacteristics {

    static String readFile(String fileName) throws FileNotFoundException, IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }

        } finally {
            br.close();
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        boolean fileError = false;
        
        try {
            Person personfromFile = readPerson(readFile(args[0]));
            System.out.println(personfromFile);
        } catch (FileNotFoundException e) {
            fileError = true;
        }

        if (fileError) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                try {
                    Person person = readPerson(sc.nextLine());
                    System.out.println(person);
                } catch (FieldsCheckException ex) {
                    System.out.println(ex);
                }
            }

        }

    }

    public static Person readPerson(String data) throws FieldsCheckException {

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
