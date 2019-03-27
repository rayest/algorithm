package mobi.rayson.maxsub;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-03-27
 *  Time: 2:36 PM
 *  Description: 最大子序列和的两种求解方式
 **/
public class MaxSumSubSeq {
    public static void main(String[] args) {
        int[] a = new int[]{20, 2, 1, -3, 8, 0, 5, -9, -4, 60, -7};
//        System.out.println(max1(a));
//        System.out.println(max2(a));
        System.out.println(max3(a));
    }

    private static int max1(int[] a) {
        int max = 0;
        // 确定子序列的左边界
        for (int i = 0; i < a.length; i++) {
            // 确定子序列的右边界
            for (int j = i; j < a.length; j++) {
                int tmp = 0;
                // 确定完子序列左右边界后，将序列中的每个值依次取出来相加求和
                for (int k = i; k <= j; k++) {
                    tmp += a[k];
                }
                if (tmp > max) {
                    max = tmp;
                }
            }
        }
        return max;
    }

    public static int max2(int[] a) {
        int max = 0;
        // 确定左边界
        for (int i = 0; i < a.length; i++) {
            int tmp = 0;
            // 确定右边界。左边界固定时，右边界每次增加一个元素，计算新加入元素的序列和
            for (int j = i; j < a.length; j++) {
                tmp += a[j];
                if (tmp > max)
                    max = tmp;
            }
        }
        return max;
    }

    //递归，分治策略
    //2分logn，for循环n，固O(nlogn)
    public static int max3(int[] a) {
        return maxSumRec(a, 0, a.length - 1);
    }

    public static int maxSumRec(int[] a, int left, int right) {
        //递归中的基本情况
        if (left == right) {
            if (a[left] > 0) return a[left];
            else return 0;
        }
        int center = (left + right) / 2;
        //最大子序列在左侧
        int maxLeftSum = maxSumRec(a, left, center);
        //最大子序列在右侧
        int maxRightSum = maxSumRec(a, center + 1, right);
        //最大子序列在中间（左边靠近中间的最大子序列+右边靠近中间的最大子序列）
        int maxLeftBorderSum = 0, leftBorderSum = 0;
        for (int i = center; i >= left; i--) {
            leftBorderSum += a[i];
            if (leftBorderSum > maxLeftBorderSum) maxLeftBorderSum = leftBorderSum;
        }
        int maxRightBorderSum = 0, rightBorderSum = 0;
        for (int i = center + 1; i <= right; i++) {
            rightBorderSum += a[i];
            if (rightBorderSum > maxRightBorderSum) maxRightBorderSum = rightBorderSum;
        }
        //返回最大子序列在左侧，在右侧，在中间求出的值中的最大的
        return max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);
    }

    public static int max3(int a, int b, int c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }
}
