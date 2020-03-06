package mobi.rayson.algorithum.algorithmsbook.stack;

import java.util.Stack;

/**
 * @author lirui
 * 通过栈实现回文判断
 */
public class PalindromeDemoStack {
    public static void main(String[] args) {
        System.out.println(isPalindrome("12321"));
    }

    private static boolean isPalindrome(String str) {
        int length = str.length();
        int middle = length % 2;
        if (middle == 0) {
            return evenNumberIsPalindrome(str);
        }
        return oddNumberIsPalindrome(str);
    }

    private static boolean oddNumberIsPalindrome(String str) {
        System.out.println("判断奇数位是否是回文");
        int length = str.length();
        int leftEnd = length / 2 - 1;
        Stack<Character> stackForLeft = new Stack<>();
        for (int i = 0; i <= leftEnd; i++) {
            stackForLeft.push(str.charAt(i));
        }
        int rightStart = length / 2 + 1;
        for (int i = rightStart; i < str.length(); i++) {
            if (stackForLeft.pop() != str.charAt(i)){
                return false;
            }
        }
        return true;
    }

    private static boolean evenNumberIsPalindrome(String str) {
        System.out.println("判断偶数位是否是回文");
        int length = str.length();
        int leftEnd = length / 2 - 1;
        Stack<Character> stackForLeft = new Stack<>();
        for (int i = 0; i <= leftEnd; i++) {
            stackForLeft.push(str.charAt(i));
        }

        int rightStart = length / 2;
        for (int i = rightStart; i < str.length(); i++) {
            if (stackForLeft.pop() != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
