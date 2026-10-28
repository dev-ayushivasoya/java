class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Superr extends Parent {
    void show() {
        super.show(); 
        System.out.println("Child method");
    }

    public static void main(String[] args) {
        new Superr().show();
    }
}
