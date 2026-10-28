class Box<T> {
T value;
Box(T value) {
this.value = value;
}
T get() {
return value;
}
}
public class GenericClass {
public static void main(String[] args) {
Box<Integer> b1 = new Box<>(100);
Box<String> b2 = new Box<>("Java");
System.out.println(b1.get());
System.out.println(b2.get());
}
}
