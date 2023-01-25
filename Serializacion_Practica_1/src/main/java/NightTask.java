import java.util.concurrent.Semaphore;

public class NightTask implements Runnable{

    private Semaphore semaphore;

    public NightTask(Semaphore semaphore) {
        this.semaphore = semaphore;
    }


    @Override
    public void run() {
        System.out.println("Its night at the moment");
    }
}
