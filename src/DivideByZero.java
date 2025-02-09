import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("Enter number to divide by zero");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int o = -1;
        try {
            o = n / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Program completed");
    }
}
