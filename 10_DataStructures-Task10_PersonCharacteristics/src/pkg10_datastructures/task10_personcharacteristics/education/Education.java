package pkg10_datastructures.task10_personcharacteristics.education;

import java.time.LocalDate;

public abstract class Education {

    boolean graduated = false;
    private LocalDate enrollmentDate;
    LocalDate graduationDate;
    private String institutionName;

    public abstract String getDegree();

    abstract void gotGraduated();

    
    //Throwing expetions methods
    public void checkDates(LocalDate enrollment, LocalDate graduation) throws FieldsCheckException {
        if (graduation.isBefore(enrollment)) {
            throw new FieldsCheckException("Graduation date is expected to be after enrollment date.");
        }
    }

    public void checkGraduationDate(LocalDate graduationDate)throws FieldsCheckException
    {
    if (graduationDate.isAfter(LocalDate.now())) {
             
             throw new FieldsCheckException("No final grade can be provided before graduation.");
         }
    }
    
    Education(String institution, LocalDate enrollmentDate, LocalDate graduationDate) throws FieldsCheckException {
        
       
            this.institutionName = institution;
            checkDates(enrollmentDate, graduationDate);
            this.enrollmentDate = enrollmentDate;
            this.graduationDate = graduationDate;
   
    }

    public boolean isGraduated() {
        return graduated;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getInstitutionName() {
        return institutionName;
    }
}