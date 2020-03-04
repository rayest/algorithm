package mobi.rayson.algorithum.sort;

import java.util.Arrays;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2018-12-11
 *  Time: 9:44 PM
 *  Description: 插入排序
 *  左边已排序、右边还未排序
 *  将右边的元素逐个取出来和左边的逐个进行比较，可以选择从尾到头进行比较插入
 *
 **/
public class InsertionSort {
  public static void main(String[] args) {
    int[] scores = new int[] {3, 5, 0, 9, 7, 8, 2, 6, 4, 1};
    int[] sortedScores = sort(scores);
    Arrays.stream(sortedScores).mapToObj(score -> score + " ").forEach(System.out::print);
  }

  private static int[] sort(int[] scores) {
    int length = scores.length;
    if (length <= 1) return scores;

    // 从第二个元素开始，因为第一个元素已排好序
    for (int i = 1; i < length; i++) {
      int value = scores[i];
      int j = i - 1;
      for (; j >= 0; j--) {
        if (scores[j] > value) {
          scores[j + 1] = scores[j];
        } else {
          break; // 如果右边的一个元素即 value 大于或等于左边的一个元素，则停止左侧数据向右移动并退出当前循环
        }
      }
      scores[j + 1] = value; // 每次循环结束，将右侧元素赋值给停止循环位置元素
    }
    return scores;
  }
}
