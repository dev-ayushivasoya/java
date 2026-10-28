public class StringMethods {
public static void main(String[] args) {
String s = " Java Programming ";
System.out.println(s.length());
System.out.println(s.trim());
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s.trim().charAt(0));
System.out.println(s.indexOf("Pro"));
System.out.println(s.contains("Java"));
System.out.println(s.replace("Java", "Core Java"));
System.out.println(s.trim().substring(5));
System.out.println("abc".equals("ABC"));
System.out.println("abc".equalsIgnoreCase("ABC"));
System.out.println("a,b,c".split(",").length);
}
}
