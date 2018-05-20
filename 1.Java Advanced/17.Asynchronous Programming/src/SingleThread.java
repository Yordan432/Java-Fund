
public class SingleThread {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 1; i <=10; i++) {
                System.out.printf("[%s]" ,i);
            }
        };
        Thread tread = new Thread(task);
        tread.start();
        tread.join();
        System.exit(1);

    }
}
