package farrel.putra.error;

public class ValidationException extends Throwable{

    public ValidationException(String message) {
        super(message);
    }

    /**
     * di parent class nya udah ada getMessage,
     * jadi ga perlu2 banget nge override
     */
    // private String message;

    // @Override
    // public String getMessage() {
        // return message;
    // }
}
