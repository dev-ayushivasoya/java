interface Greeting {
void sayHello();
default void sayBye() {
System.out.println("Goodbye!");
}
}
class Person implements Greeting {
public void sayHello() {
System.out.println("Hello!");
}
}
public class DefaultMethodDemo {
public static void main(String[] args) {
Person p = new Person();
p.sayHello();
p.sayBye(); 
}
}
