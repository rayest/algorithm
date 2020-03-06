package mobi.rayson.algorithum.algorithmsbook.string;

/**
 * @author lirui
 * 判断字符串是否是回文，不使用其他数据结构
 * 1. 定义左右两个变量，标记字符串的下标
 * 2. 依次比较是否相等
 */
public class PalindromeDemo {
    public static void main(String[] args) {
        System.out.println(isPalindrome("122231"));
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right && str.charAt(left) == str.charAt(right)) {
            left++;
            right--;
        }
        return left >= right;
    }
}
