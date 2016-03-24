package wizard.Exception;

public class BagFullException extends Exception {
    public BagFullException(){
        super("bag is already full, cant hold anymore ball");
    }
}
