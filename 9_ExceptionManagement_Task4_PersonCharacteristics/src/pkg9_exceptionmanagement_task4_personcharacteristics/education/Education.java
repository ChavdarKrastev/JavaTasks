package pkg9_exceptionmanagement_task4_personcharacteristics.education;

import java.time.LocalDate;

public abstract class Education {

    boolean graduated;
    private LocalDate enrollmentDate;
    LocalDate graduationDate;
    private String institutionName;

    public abstract String getDegree();

    abstract void gotGraduated();

    public void checkDates(LocalDate enrollment, LocalDate graduation) throws FieldsCheckException {
        if (graduation.isBefore(enrollment)) {
            throw new FieldsCheckException("Graduation date error.");
        }
    }

    Education(String institution, LocalDate enrollmentDate, LocalDate graduationDate) {
        
        try {
            this.institutionName = institution;
            checkDates(enrollmentDate, graduationDate);
            this.enrollmentDate = enrollmentDate;
            this.graduationDate = graduationDate;
        } catch (FieldsCheckException ex) {
            System.out.println("Graduation date is expected to be after enrollment date.");
        }

        
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
