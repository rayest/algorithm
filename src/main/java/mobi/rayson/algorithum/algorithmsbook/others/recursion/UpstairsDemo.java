package mobi.rayson.algorithum.algorithmsbook.others.recursion;

/**
 * @author lirui
 * 楼梯的走法有多少种，每次可以选择走1阶或者2阶或者3阶
 * if n = 1 then 1;
 * if n = 2 then 2;
 * if n = 3 then 3;
 */
public class UpstairsDemo {
    public static void main(String[] args) {
        System.out.println(howManyWays(4));
    }

    private static long howManyWays(int n) {
        if (n <= 3) {
            return n;
        }
        return howManyWays(n - 1) + howManyWays(n - 2) + howManyWays(n - 3);
    }
}
