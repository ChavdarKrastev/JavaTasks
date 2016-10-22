package pkg10_datastructures.task10_personcharacteristics;

import pkg10_datastructures.task10_personcharacteristics.Address;
import pkg10_datastructures.task10_personcharacteristics.education.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private char gender;
    private LocalDate dateOfBirth;
    private short height;
    
    private List<Education>  education;
    
    private Address address;
    
    private List<Address> pastAdresses;

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

    @Override
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
                heOrShe, education.get(education.size()-1).getDegree().toLowerCase(), 
                education.get(education.size()-1).getInstitutionName(), education.get(education.size()-1).getEnrollmentDate());
        if(education.get(education.size()-1).isGraduated()){
            result += String.format(" and finished on %s.", education.get(education.size()-1).getGraduationDate());
           
            if( ! education.get(education.size()-1).getDegree().equalsIgnoreCase("Primary")) {
                
                    result += String.format(" %s grade was %.3f.", hisOrHer, ((GradedEducation) education).getFinalGrade());
                
            }
        
        } else{
            result += String.format(" and is supposed to graduate on %s.", education.get(education.size()-1).getGraduationDate());
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
        this.education.add(education);
    }
    
    public void removeEducation(String degree)
    {
        for(Education oneEducation : education)
        {
            if(oneEducation.getDegree().equals(degree))
            {
                education.remove(oneEducation);
            }
        }
    }
    
    public void addAddress(Address address){
        this.address = address;
        this.pastAdresses.add(address);
    }
//    public Education getEducation() {
//        return education;
//    }
    
}