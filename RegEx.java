import java.util.regex.*;
public class RegEx {
public static void main(String[] args) {

Pattern emailPattern = Pattern.compile("[a-z0-9]+@[a-z]+[.]com");
Matcher m1 = emailPattern.matcher("ayushi99@gmail.com");
System.out.println("Valid email: " + m1.matches());

Pattern numPattern = Pattern.compile("[0-9]+");
Matcher m2 = numPattern.matcher("Room 12 has 45 chairs and 7 fans");
while (m2.find()) {
System.out.println("Found: " + m2.group() + " at index " + m2.start());
}
}
}
