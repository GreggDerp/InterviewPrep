import java.util.Locale;

public class StringContainsVowels {
    public static void main(String[] args) {
        System.out.println(stringContainsValue("Gage")); //true
        System.out.println(stringContainsValue("FF")); //false

        Object test = "test";
        String test2 = (String) test;
        System.out.println(test2);
        test2 = test.toString();
        System.out.println(test2);
    }

    public static boolean stringContainsValue(String input) {
        return input.toLowerCase().matches(".*[aeiou]");
    }


}
