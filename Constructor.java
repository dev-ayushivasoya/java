class Student {
int id;
String name;
Student(int i, String n) {
id = i;
name = n;
}
void display() {
System.out.println(id + " " + name);
}
}
public class ConstructorDemo {
public static void main(String[] args) {
Java Practicals 1 to 24 - Short Codes
Page 6 of 35
Student s = new Student(1, "Ayushi");
s.display();
}
}
