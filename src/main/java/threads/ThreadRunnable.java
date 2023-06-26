package threads;

public class ThreadRunnable implements Runnable {

    private String name;

    public ThreadRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "is running");
    }
}
