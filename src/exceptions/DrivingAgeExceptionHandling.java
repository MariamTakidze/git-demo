package exceptions;

public class DrivingAgeExceptionHandling {
    static void validateDrivingAge (int age) throws InvalidDrivingAgeException{
        if(age < 17){


            throw new InvalidDrivingAgeException("age is not valid to get Driving license");
        }
        else {
            System.out.println("You can get Driving license");
        }
    }
    public static void main(String[] args) {
        try{
            validateDrivingAge(16);
        }
        catch (NumberFormatException  e){
            System.out.println("Number format exception occurred" + e.getMessage());
        }
        catch (InvalidDrivingAgeException exception){
            System.out.println("Age is less than 17");
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("I am always executed");
        }
        System.out.println("End of our journey");
    }
}
