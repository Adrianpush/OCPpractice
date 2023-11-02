package threads;

public class StartingMultipleThreads implements Runnable {

    private final String name;

    public StartingMultipleThreads(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new StartingMultipleThreads("Thread One"));
        Thread thread2 = new Thread(new StartingMultipleThreads("Thread Two"));

        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        System.out.println(name.concat(" is running."));
    }
}
