class MyThread extends Thread {
    // constructor
    MyThread(String name) {
        super(name);
    }

    public void run() {
        String tname;
        tname = super.getName();

        for (int i = 1; i <= 1000; i++) {
            System.out.println(tname + "(" + i + ")");
        }
    }
}

public class SimpleThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        t1.start();
        t2.start();
    }
}
