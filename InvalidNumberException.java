package foot;

public class InvalidNumberException extends Exception{
    public InvalidNumberException(){
        super("Invalid Number");
    }
    public InvalidNumberException(String message){
        super(message);
    }
}