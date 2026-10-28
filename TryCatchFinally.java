public class TryCatchFinally {
public static void main(String[] args) {
try {
int result = 10 / 0;
System.out.println(result);
} catch (ArithmeticException e) {
System.out.println("Error: " + e.getMessage());
} finally {
System.out.println("Finally block always runs");
}
}
}
