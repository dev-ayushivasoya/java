abstract class Shape {
abstract double area(); 
void info() {
System.out.println("I am a shape");
}
}
class Rectangle extends Shape {
double area() {
return 4 * 5;
}
}
public class AbstractDemo {
public static void main(String[] args) {
Shape s = new Rectangle();
s.info();
System.out.println("Area: " + s.area());
}
}
