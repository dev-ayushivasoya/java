public class ThrowsDemo {
static void test() throws Exception {
throw new Exception("Exception passed using throws");
}
public static void main(String[] args) {
try {
test();
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
}
