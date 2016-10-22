package pkg10_datastructures.task10_personcharacteristics.education;

public class FieldsCheckException extends RuntimeException{
    
    FieldsCheckException(String message) {
        super(message);
    }

    FieldsCheckException(String message, Throwable ex) {
        super(message, ex);
    }
}