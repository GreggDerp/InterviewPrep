public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(1, 30);
    }

    public static void fizzBuzz(int start, int end) {
        for (int i = start; i < end + 1; i++) {
            StringBuilder output = new StringBuilder();
            if (i % 3 == 0) {
                output.append("Fizz");
            }
            if (i % 5 == 0) {
                output.append("Buzz");
            }
            System.out.println(output.isEmpty() ? i : output);
        }

    }
}
