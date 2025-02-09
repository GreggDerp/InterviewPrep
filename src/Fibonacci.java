public class Fibonacci {
    public static void main(String[] args) {
        generateFibonacci(10);
        generateFibonacci(20);
    }

    private static void generateFibonacci(int length) {
        int previous = 0;
        int current = 1;
        for (int i = 0; i < length; i++) {
            int next = previous + current;
            System.out.print(next + (i < length -1 ? ", " : "\n"));
            previous = current;
            current = next;
        }
    }
}
