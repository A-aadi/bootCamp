package wizard;

public class RulesAreBrokenException extends Exception {
    public RulesAreBrokenException(){
        super("You are not allowed to destroy Balloria");
    }

}

