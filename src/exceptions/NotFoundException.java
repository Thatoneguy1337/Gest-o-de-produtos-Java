package exceptions;

public class NotFoundException extends Exception {

    public NotFoundException() {
        super("Barcode Not Found");
    }
}