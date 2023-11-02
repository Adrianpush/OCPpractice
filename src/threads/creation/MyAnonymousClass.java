package threads.creation;

public class MyAnonymousClass {

    public static void main(String[] args) {
        Thread myRunnable = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Annonymous class is running.");
            }
        });
        myRunnable.start();
    }
}
