class Box {
int length, width;
Box() {
length = 1;
width = 1;
}
Box(int l) {
length = l;
width = l;
}
Box(int l, int w) {
length = l;
width = w;
}
int area() {
return length * width;
}
}
public class Overloading {
public static void main(String[] args) {
System.out.println(new Box().area());
System.out.println(new Box(4).area());
System.out.println(new Box(4, 5).area());
}
}
