package exceptions;

public class InvalidDrivingAgeException extends AgeLessThanZeroException{
    public InvalidDrivingAgeException(){}
    public InvalidDrivingAgeException(String message){
        super(message);
    }
}
