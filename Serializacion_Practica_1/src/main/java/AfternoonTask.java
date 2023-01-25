import java.util.concurrent.Semaphore;

public class AfternoonTask implements Runnable {

        private Semaphore semaphore;

    public AfternoonTask(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
        public void run() {
        try {
            semaphore.acquire(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

            System.out.println("Its afternoon at the moment");

        semaphore.release();



        }
    }


