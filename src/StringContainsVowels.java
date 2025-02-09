import java.util.Locale;

public class StringContainsVowels {
    public static void main(String[] args) {
        System.out.println(stringContainsValue("Gage")); //true
        System.out.println(stringContainsValue("FF")); //false
    }

    public static boolean stringContainsValue(String input) {
        return input.toLowerCase().matches(".*[aeiou]");
    }
}
