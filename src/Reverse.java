/*

Write a Java program to reverse a given string while keeping all special characters (like punctuation and spaces) in their original positions.

Input:  "a,b$c"
Output:   c,b$a

Input: hello@world! 
Output: dlrow@olleh!


*/

public class Reverse {

    public static void main(String[] args) {
        reverseWithSpecialChars("Ga!ge$abc");
        reverseWithSpecialChars("!abc");
        // output cb!ae$gaG
    }

    public static void reverseWithSpecialChars(String input) {
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String inputString) {
        char[] chars = inputString.toCharArray();
        int left = 0;
        int right = inputString.length() - 1;
        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return String.copyValueOf(chars);
    }
}