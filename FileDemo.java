import java.nio.file.*;
import java.util.List;
public class FileDemo {
public static void main(String[] args) throws Exception {
Path file = Paths.get("sample.txt");
Path copy = Paths.get("sample_copy.txt");
Files.write(file, "Hello NIO".getBytes()); 

List<String> lines = Files.readAllLines(file); 
System.out.println(lines);
Files.copy(file, copy, StandardCopyOption.REPLACE_EXISTING);
System.out.println("Exists: " + Files.exists(copy));
System.out.println("Size : " + Files.size(file) + " bytes");
Files.delete(copy); 
}
}
