import java.nio.file.*;
public class DirectoryDemo {
public static void main(String[] args) throws Exception {
Path dir = Paths.get("mydir");
Files.createDirectories(dir); 
Files.write(dir.resolve("a.txt"), "A".getBytes());
Files.write(dir.resolve("b.txt"), "B".getBytes());
try (DirectoryStream<Path> ds = Files.newDirectoryStream(dir)) {
for (Path p : ds) {
System.out.println(p.getFileName()); // list files
}
}
Files.delete(dir.resolve("a.txt"));
Files.delete(dir.resolve("b.txt"));
Files.delete(dir); // delete
}
}
