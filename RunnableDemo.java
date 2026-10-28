class MyTask implements Runnable {
public void run() {
for (int i = 1; i <= 3; i++) {
System.out.println(Thread.currentThread().getName() + " : " + i);
}
}
}
public class RunnableDemo {
public static void main(String[] args) {
Thread t1 = new Thread(new MyTask(), "Thread-A");
Thread t2 = new Thread(new MyTask(), "Thread-B");
t1.start();
t2.start();
}
}
