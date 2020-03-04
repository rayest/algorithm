package mobi.rayson.algorithum.algorithmsbook.others.recursion;

/**
 * @author lirui
 * 1 对新生幼兔，两个月之后可以生小兔，之后每个月可以生一队兔子
 * ---------|-------|-------|-------|-------|-------|-------|-------|
 * 经过月数 |   0   |   1   |   2   |   3   |   4   |   5   |   6   |
 * ---------|-------|-------|-------|-------|-----------------------|
 * 新生幼兔 |   1   |   0   |   1   |   1   |   2   |   3   |   5   |
 * ---------|-------|-------|-----------------------|-------|-------|
 * 成年兔子 |   0   |   1   |   1   |   2   |   3   |   5   |   8   |
 * ---------|-------|-------|-------|-------|-------|-------|-------|
 */
public class RabbitBirth {
    public static void main(String[] args) {
        System.out.println(rabbitParis(5));
    }

    private static long rabbitParis(int n) {
        if (n <= 2) {
            return n;
        }
        return rabbitParis(n - 1) + rabbitParis(n - 2);
    }
}
