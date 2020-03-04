package mobi.rayson.algorithum.sort;

import java.util.Arrays;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2018-12-09
 *  Time: 10:06 PM
 *  Description: 冒泡排序算法。
 *  比较并交换相邻两个数据大小
 *  时间复杂度：最好可能 O(n)，最坏可能 O(n^2)
 *  是原地排序算法：因为空间复杂度为O(1)，只需要常量级的临时内存空间
 *  是稳定的排序算法：因为两个相同元素在排序后，相对顺序不变
 **/
public class BubbleSort {
  public static void main(String[] args) {
    int[] scores = new int[] {1, 6, 2, 0, 3, 7, 10, 54, 37, 85, 9};
    int[] sortedScores = sort(scores);
    Arrays.stream(sortedScores).mapToObj(score -> score + " ").forEach(System.out::print);
  }

  private static int[] sort(int[] scores) {
    int length = scores.length;
    if (length <= 1) return scores;
    for (int i = 0; i < length; i++) {
      boolean flag = false;
      for (int j = 0; j < length - i - 1; j++) {
        if (scores[j] > scores[j + 1]) {
          int tmp = scores[j];
          scores[j] = scores[j + 1];
          scores[j + 1] = tmp;
          flag = true; // 说明发生了数据交换
        }
      }
      if (!flag) break; // 如果没有发生交换，则说明数据已排好序，直接退出循环
    }
    return scores;
  }
}
