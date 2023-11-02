package threads;

public class ThreadLifeCycle extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("The thread is running and going 2 seconds for sleep");
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            System.out.println("Thread was interrupted");
        }

        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycle threadLifeCycle = new ThreadLifeCycle();
        System.out.println("Thread state after creation " + threadLifeCycle.getState());

        threadLifeCycle.start();
        System.out.println("Thread state after it was started " + threadLifeCycle.getState());

        Thread.sleep(5000);
        System.out.println("Thread state while is on sleep " + threadLifeCycle.getState());

        threadLifeCycle.join();
        System.out.println("Thread state after finishing: " + threadLifeCycle.getState());
    }
}
