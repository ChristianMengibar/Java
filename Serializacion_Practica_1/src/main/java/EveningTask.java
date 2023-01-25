import java.util.concurrent.Semaphore;

public class EveningTask implements Runnable {
    private Semaphore semaphore;

    public EveningTask(Semaphore semaphore) {
        this.semaphore = semaphore;
    }


    @Override
    public void run() {

        System.out.println("Its evening at the moment");

    }
}
