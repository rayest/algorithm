package mobi.rayson.algorithum.algorithmsbook.others.recursion;

/**
 * @author lirui
 * f(n) = n! = n * (n-1) * (n-2) * ...* 2 * 1
 * f(0) = 1
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static long factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * factorial(i - 1);
    }
}
