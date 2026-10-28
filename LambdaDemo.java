import java.util.Arrays;
import java.util.List;
interface Add {
int sum(int a, int b);
}
public class LambdaDemo {
public static void main(String[] args) {

Add add = (a, b) -> a + b;
System.out.println("Sum: " + add.sum(5, 3));

Runnable r = () -> System.out.println("Running using lambda");
r.run();

List<String> names = Arrays.asList("Amit", "Riya", "Sam");
names.forEach(n -> System.out.println(n));
}
}
