package exceptions;

public class NegativePriceException extends Exception {

    public NegativePriceException() {
        super("Price cannot be negative.");
    }
}