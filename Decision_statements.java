public class Decision_statements {
public static void main(String[] args) {
int a = 10, b = 25, c = 15;
if (a >= b && a >= c)
System.out.println("Largest: " + a);
else if (b >= c)
System.out.println("Largest: " + b);
else
System.out.println("Largest: " + c);
int day = 3;
switch (day) {
case 1: System.out.println("Monday"); break;
case 2: System.out.println("Tuesday"); break;
case 3: System.out.println("Wednesday"); break;
default: System.out.println("Other day");
}
}
}
