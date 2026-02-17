public class BackgroundJobExecution {
    public static void main(String[] args) throws InterruptedException {
        Runnable job = () -> System.out.println("Background job running");
        Thread t = new Thread(job);
        t.start();
        t.join();
        System.out.println("Job finished");
    }
}
