package pkg9_exceptionmanagement_task4_personcharacteristics.education;

public class FieldsCheckException extends RuntimeException{
    
    FieldsCheckException(String message) {
        super(message);
    }

    FieldsCheckException(String message, Throwable ex) {
        super(message, ex);
    }
}