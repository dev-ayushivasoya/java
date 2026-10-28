import java.lang.annotation.*;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@interface MyInfo {
String author();
int version() default 1;
}

class Demo {
@MyInfo(author = "Ayushi", version = 2)
public void show() {
System.out.println("Annotated method");
}
}
public class AnnotationDemo {
public static void main(String[] args) throws Exception {
Method m = Demo.class.getMethod("show");
MyInfo info = m.getAnnotation(MyInfo.class);
System.out.println("Author : " + info.author());
System.out.println("Version : " + info.version());
}
}
