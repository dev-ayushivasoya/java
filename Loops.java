public class Loops {
public static void main(String[] args) {

int fact = 1;
for (int i = 1; i <= 5; i++) {
fact = fact * i;
}
System.out.println("Factorial: " + fact);

int n = 1234, sum = 0;
while (n > 0) {
sum = sum + n % 10;
n = n / 10;
}
System.out.println("Sum of digits: " + sum);

int j = 1;
do {
System.out.println("5 x " + j + " = " + (5 * j));
j++;
} while (j <= 5);
}
}
