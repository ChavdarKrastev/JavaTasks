
package pkg9_exceptionmanagement_task4_personcharacteristics;


public class FieldsCheckException extends Exception{
    
    FieldsCheckException(String message) {
        super(message);
    }

    FieldsCheckException(String message, Throwable ex) {
        super(message, ex);
    }
}
