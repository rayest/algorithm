package mobi.rayson.algorithum.algorithmsbook.others.recursion;


/**
 * @author lirui
 * f(n) = f(n-1) + f(n-2);
 * and f(0) = 0 if n = 0;
 * and f(1) = 1 if n = 1;
 */
public class RecursionOne {
    public static void main(String[] args) {
        System.out.println(calculate(4));
    }

    private static long calculate(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return calculate(n - 1) + calculate(n - 2);
    }
}
