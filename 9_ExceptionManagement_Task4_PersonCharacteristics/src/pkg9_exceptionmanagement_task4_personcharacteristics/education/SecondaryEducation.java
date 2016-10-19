package pkg9_exceptionmanagement_task4_personcharacteristics.education;

import java.time.LocalDate;

public class SecondaryEducation extends GradedEducation {
    
    public SecondaryEducation(String institution, LocalDate enrollmentDate, LocalDate graduationDate) throws FieldsCheckException {
        super(institution, enrollmentDate, graduationDate);
    }

    @Override
    public String getDegree() {
        return "Secondary";
    }
}