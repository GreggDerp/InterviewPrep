public class SwapNumbers {
    public static void main(String[] args) {
        swapNumbers(10, 20);
    }

    public static void swapNumbers(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);
    }
}
