public class Branching_statements {
    public static void main(String[] args) {

int num = 17;
boolean prime = true;
for (int i = 2; i <= num / 2; i++) {
if (num % i == 0) {
prime = false;
break;
}
}
System.out.println(num + (prime ? " is prime" : " is not prime"));

for (int i = 1; i <= 10; i++) {
if (i % 2 == 0)
continue;
System.out.print(i + " ");
}
}
}
