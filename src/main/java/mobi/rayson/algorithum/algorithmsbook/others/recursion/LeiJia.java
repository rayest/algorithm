package mobi.rayson.algorithum.algorithmsbook.others.recursion;

/**
 * @author lirui
 * f(100) = 100 + 99 + 98 + ... + 1
 */
public class LeiJia {
    public static void main(String[] args) {
        System.out.println(leiJia(100));
    }

    private static long leiJia(int n) {
        if (n == 1) {
            return 1;
        }
        return n + leiJia(n - 1);
    }
}
