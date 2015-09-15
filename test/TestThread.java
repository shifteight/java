public class TestThread {
    public static void main(String[] args) {
        Runner r = new Runner();
        Thread t = new Thread(r);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main thread:--------" + i);
            //System.out.println("t priority: " + t.getPriority());
        }
    }
}

class Runner implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runner: " + i);
        }
    }
}
