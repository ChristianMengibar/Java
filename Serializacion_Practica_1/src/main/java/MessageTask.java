import java.util.concurrent.Semaphore;

public class MessageTask implements Runnable{

    private Semaphore semaphore;

    private String msg1;
    private String msg2;
    private String msg3;
    private String msg4;

    private int counter;

    public MessageTask(Semaphore semaphore, String msg1, String msg2, String msg3, String msg4, int counter) {
        this.semaphore = semaphore;
        this.msg1 = msg1;
        this.msg2 = msg2;
        this.msg3 = msg3;
        this.msg4 = msg4;
        this.counter = counter;
    }

    @Override
    public void run() {


        try {
            semaphore.acquire();
            for (int i = 0; i < counter; i++) {

                System.out.println(msg1);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        semaphore.release(2);


        try {
            semaphore.acquire(3);
            for (int i = 0; i < counter; i++) {

                System.out.println(msg2);
                Thread.sleep(200);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release(5);
/*
        try {
            for (int i = 0; i < counter; i++) {

                System.out.println(msg3);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            for (int i = 0; i < counter; i++) {

                System.out.println(msg4);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        }

 */
    }

    }
