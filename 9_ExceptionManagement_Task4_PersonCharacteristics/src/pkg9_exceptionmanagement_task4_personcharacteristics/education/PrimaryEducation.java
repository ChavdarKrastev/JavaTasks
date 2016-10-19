package pkg9_exceptionmanagement_task4_personcharacteristics.education;

import java.time.LocalDate;


public class PrimaryEducation extends Education{

    public PrimaryEducation(String institution, LocalDate enrollmentDate, LocalDate graduationDate) throws FieldsCheckException {
        super(institution, enrollmentDate, graduationDate);
    }

    @Override
    public String getDegree() {
        return "Primary";
    }

    @Override
    public void gotGraduated() {
        graduated = true;
    }
    
}