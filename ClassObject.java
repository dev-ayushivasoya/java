class Student {
int id;
String name;
void display() {
System.out.println(id + " " + name);
}
}
public class ClassObject {
public static void main(String[] args) {
Student s = new Student();
s.id = 1;
s.name = "Ayushi";
s.display();
}
}
