import org.jetbrains.annotations.NotNull;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Gage"));
        System.out.println(reverseString("Jessica"));
    }

    public static String reverseString(@NotNull String input) {
        StringBuilder output = new StringBuilder();
        char[] inputChars = input.toCharArray();
        for (int i = inputChars.length - 1; i > -1; i--) {
            output.append(inputChars[i]);
        }
        return output.toString();
    }
}
