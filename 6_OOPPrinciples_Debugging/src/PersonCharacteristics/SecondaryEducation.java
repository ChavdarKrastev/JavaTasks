
package PersonCharacteristics;

import java.time.LocalDate;

public class SecondaryEducation {
    
    private double _finalGrade;
    private boolean _graduated;
    private LocalDate _enrollmentDate;
    private LocalDate _graduationDate;
    private String _institutionName;
    
    SecondaryEducation(double grade, LocalDate enrollment, LocalDate graduation, String institution)
    {
        this._finalGrade = grade;
        this._enrollmentDate = enrollment;
        this._graduationDate = graduation;
        this._institutionName = institution;
        if(graduation.compareTo(LocalDate.now())>0)
        {
            _graduated = true;
        }
        else if (graduation.compareTo(LocalDate.now())<0)
        {
            _graduated = false;
        }
    }
    
    void changeStatutGrade(boolean graduation)
    {
        this._graduated = graduation;
    }
    
    void changeStatutGrade(double mark)
    {
        this._finalGrade = mark;
    }
    
    LocalDate getEnrollment ()
    {
        return _enrollmentDate;
    }
    
    String getInstitution ()
    {
        return _institutionName;
    }
    LocalDate getGraduation ()
    {
        return _graduationDate;
    }
    void setGraduation (LocalDate graduationDate)
    {
        this._graduationDate = graduationDate;
    }    
    double getGrade ()
    {
        return _finalGrade;
    }
    void setGrade (double grade)
    {
        this._finalGrade = grade;
    }
    boolean getGraduated ()
    {
        return _graduated;
    }
}
