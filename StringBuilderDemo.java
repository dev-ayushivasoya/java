public class StringBuilderDemo {
public static void main(String[] args) {
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb);
sb.insert(5, ",");
System.out.println(sb);
sb.replace(0, 5, "Hi");
System.out.println(sb);
sb.delete(2, 3);
System.out.println(sb);
sb.reverse();
System.out.println(sb);
System.out.println("Length: " + sb.length());
}
}
