class InvalidAgeException extends Exception {
InvalidAgeException(String msg) {
super(msg);
}
}
public class CustomException {
static void validate(int age) throws InvalidAgeException {
if (age < 18)

throw new InvalidAgeException("Age must be 18 or above");
System.out.println("Valid age");
}
public static void main(String[] args) {
try {
validate(12);
} catch (InvalidAgeException e) {
System.out.println("Caught: " + e.getMessage());
}
}
}
