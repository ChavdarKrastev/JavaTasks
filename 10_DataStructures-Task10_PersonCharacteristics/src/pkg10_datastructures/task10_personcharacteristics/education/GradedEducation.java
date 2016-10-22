package pkg10_datastructures.task10_personcharacteristics.education;

import java.time.LocalDate;

public abstract class GradedEducation extends Education{
    float finalGrade;

    public GradedEducation(String institution, LocalDate enrollmentDate, LocalDate graduationDate) throws FieldsCheckException {
        super(institution, enrollmentDate, graduationDate);
    }
    
    public float getFinalGrade() {
        if(isGraduated()){
             return finalGrade;    
        }
        else
        {
        return -1;
        }
    }
    
    
    @Override
    void gotGraduated(){
        
        graduated = true;
    }
    
    public void gotGraduated(float finalGrade){
        
        gotGraduated();
        this.finalGrade = finalGrade;
    }
}