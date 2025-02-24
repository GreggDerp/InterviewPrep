import java.util.ArrayList;

public class LongestPalindrome {
    public static void main(String[] args) {
        findLongestPalindrome("madamracecar");
        findLongestPalindrome("gage");
    }

    public static void findLongestPalindrome(String input) {
        String longest = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String sub = input.substring(i, j);
                if (isPalindrome(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        System.out.println(longest);
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() <=1) {
            return true;
        }
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

























//    public static boolean isPalindrome(String str) {
//        if (str == null || str.length() <= 1) {
//            return true;
//        }
//        int left = 0;
//        int right = str.length() - 1;
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
}
