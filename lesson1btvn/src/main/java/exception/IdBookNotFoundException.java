package exception;

public class IdBookNotFoundException extends RuntimeException{
    public IdBookNotFoundException() {
        super("ID");
    }
}
