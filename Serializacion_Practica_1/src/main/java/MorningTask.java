import java.util.concurrent.Semaphore;

public class MorningTask implements Runnable{

        private Semaphore semaphore;

    public MorningTask(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
        public void run() {

        try {
            semaphore.acquire(2);
            System.out.println("Its morning at the moment");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        semaphore.release(3);


        }
    }

