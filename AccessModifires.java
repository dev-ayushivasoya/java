class Demo {
public int a = 1; 
protected int b = 2; 
int c = 3; 
private int d = 4; 
int getD() {
return d;
}
}
public class AccessModifires {
public static void main(String[] args) {
Demo obj = new Demo();
System.out.println(obj.a);

System.out.println(obj.b);
System.out.println(obj.c);
System.out.println(obj.getD()); 

}
}
