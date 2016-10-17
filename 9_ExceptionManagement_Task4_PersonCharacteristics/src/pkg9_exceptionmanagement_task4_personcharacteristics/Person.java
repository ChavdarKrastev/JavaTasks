package pkg9_exceptionmanagement_task4_personcharacteristics;

import pkg9_exceptionmanagement_task4_personcharacteristics.Address;
import pkg9_exceptionmanagement_task4_personcharacteristics.education.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

final class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private char gender;
    private LocalDate dateOfBirth;
    private short height;
    
    private Education  education;
    
    private Address address;

    Person(String firstName, String middleName, String lastName, char gender, short height, LocalDate dateOfBirth) {
        
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setHeight(height);
        
        this.dateOfBirth = dateOfBirth;
    }
       

    public short getAge() {
        return (short) dateOfBirth.until(LocalDate.now(), ChronoUnit.YEARS);
    }

   public String toString(){

        String heOrShe;
        String hisOrHer;

        if (gender == 'M') {
            heOrShe = "He";
            hisOrHer = "His";
        } else {
            heOrShe = "She";
            hisOrHer = "Her";
        }

        String result = String.format("%s %s %s is %d years old.", firstName, middleName, lastName, getAge());
        result += String.format("%s was born in %d. \n", heOrShe, dateOfBirth.getYear());
        result += String.format("%s lives at:\n", heOrShe);
        result += String.format("%s %s \n", address.getStreetNumber(),address.getStreet());
        result += String.format("fl %s, ap %s", address.getFloor(),address.getAppartment());
        if(!address.getFloor().equals("")&&!address.getAppartment().equals(""))
        {
            result += "\n";
        }
        else
        {
            result += "\b\b";
        }
        result += String.format("%s %s \n", address.getPostalCode(),address.getMunicipality());
        result += String.format("%s %s \n", address.getCity(),address.getCountry());
        result += String.format("%s started %s degree in %s on %s", 
                heOrShe, education.getDegree().toLowerCase(), 
                education.getInstitutionName(), education.getEnrollmentDate());
        if(education.isGraduated()){
            result += String.format(" and finished on %s.", education.getGraduationDate());
            
            if( ! education.getDegree().equalsIgnoreCase("Primary")) {
                result += String.format(" %s grade was %.3f.", hisOrHer, ((GradedEducation) education).getFinalGrade());
            }
        } else{
            result += String.format(" and is supposed to graduate on %s.", education.getGraduationDate());
        }

        if (isUnderAged()) {
            result += String.format(" %s %s is under-aged.", firstName, lastName);
        }

        return result;
    }

    public boolean isUnderAged() {
        return getAge() < 18;
    }
    
    // Accessors

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
       this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }
    
    public void setMiddleName(String middleName) {
       this.middleName = middleName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
       this.lastName = lastName;
    }
    
    public char getGender(){
        return gender;
    }
    
    public void setGender(char gender) {
       this.gender = gender;
    }
    
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height;
    }
    
    public void addEducation(Education education){
        this.education = education;
    }
    
    public void addAddress(Address address){
        this.address = address;
    }
    public Education getEducation() {
        return education;
    }
    
}