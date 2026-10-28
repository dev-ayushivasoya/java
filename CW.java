import java.util.*;

public class CW {
    public static void main(String[] args) {
        
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("Java"); 
        System.out.println("ArrayList: " + arrayList);

        
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Blue");
        System.out.println("LinkedList: " + linkedList);

        
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        System.out.println("Vector:    " + vector);

        
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Cat");
        hashSet.add("Dog");
        hashSet.add("Cat"); // Duplicate ignored
        System.out.println("HashSet:   " + hashSet);
    }
}
