import org.jetbrains.annotations.NotNull;

public class FindSubstrings {

    public static void main(String[] args) {
        findAllSubStrings("abcd");
        findAllSubStrings("gage");
    }

    public static void findAllSubStrings(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                System.out.println(input.substring(i,j));
            }
        }
    }
}
