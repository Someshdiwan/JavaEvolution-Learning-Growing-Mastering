class DemoThread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start(); // starts thread A
        b.start(); // starts thread B
    }
}

class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("From class A");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("From class B");
        }
    }
}
