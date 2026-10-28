import java.nio.file.*;
public class PathDemo {
public static void main(String[] args) {
Path p = Paths.get("data", "notes.txt");
System.out.println("Path : " + p);
System.out.println("File name : " + p.getFileName());
System.out.println("Parent : " + p.getParent());
System.out.println("Absolute : " + p.toAbsolutePath());
}
}
