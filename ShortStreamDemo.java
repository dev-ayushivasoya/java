import java.util.Arrays;
import java.util.List;

public class ShortStreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

       
        int totalSum = numbers.stream()
                .filter(n -> n % 2 == 0)         
                .map(n -> n * n)                 
                .sorted()                        
                .reduce(0, (a, b) -> a + b);     

        System.out.println("Result: " + totalSum); 
    }
}
