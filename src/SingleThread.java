public class SingleThread {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        currentThread.setName("Gages thread");
        currentThread.setPriority(1);
        System.out.println(currentThread);
        System.out.println(currentThread.getName());
        System.out.println(currentThread.getPriority());
    }
}
