import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        String msg1 = "Good morning";
        String msg2 = "Good afternoon";
        String msg3 = "Good evening";
        String msg4 = "Good night";
        Thread momentOfDayThread = new Thread(new MessageTask(semaphore,msg1,msg2,msg3,msg4,5));
        Thread morningMessage = new Thread(new MorningTask(semaphore));
        Thread afternoonMessage = new Thread(new AfternoonTask(semaphore));
        //Thread eveningMessage = new Thread(new EveningTask(semaphore));
        //Thread nightMessage = new Thread(new NightTask(semaphore));

        momentOfDayThread.start();
        morningMessage.start();
        afternoonMessage.start();
        //eveningMessage.start();
        //nightMessage.start();

        try {
            momentOfDayThread.join();
            morningMessage.join();
            afternoonMessage.join();
            //eveningMessage.join();
            //nightMessage.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ending program");

    }
}
