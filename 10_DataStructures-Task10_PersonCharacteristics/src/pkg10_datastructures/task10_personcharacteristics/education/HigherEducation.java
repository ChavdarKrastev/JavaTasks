package pkg10_datastructures.task10_personcharacteristics.education;

import java.time.LocalDate;

public class HigherEducation extends GradedEducation{

    String degree;
    
    public HigherEducation(String institution, LocalDate enrollmentDate, LocalDate graduationDate, String degree) throws FieldsCheckException {
        super(institution, enrollmentDate, graduationDate);
        
        if(degree.equalsIgnoreCase("B")){
            this.degree = "Bachelor";
        } else if(degree.equalsIgnoreCase("M")){
            this.degree = "Master";
        } else if(degree.equalsIgnoreCase("D")){
            this.degree = "Doctorate";
        } 
    }

    @Override
    public String getDegree() {
        return degree;
    }
}