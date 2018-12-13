package mobi.rayson.sort;

import java.util.Arrays;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2018-12-13
 *  Time: 9:54 PM
 *  Description: 选择排序。实现思路有点类似插入排序，也分已排序区间和未排序区间
 *  但是选择排序每次会从未排序区间中找到最小的元素，将其放到已排序区间的末尾
 *  ①、从待排序序列中，找到关键字最小的元素
 *  ②、如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换
 *  ③、从余下的 N - 1 个元素中，找出关键字最小的元素，重复(1)、(2)步，直到排序结束
 **/
public class SelectionSort {
  public static void main(String[] args) {
    int[] scores = new int[] {9, 5, 8, 2, 4, 1, 0, 8, 3, 6, 7, 4, 2};
    int[] sortedScores = sort(scores);
    Arrays.stream(sortedScores).mapToObj(score -> score + " ").forEach(System.out::print);
  }

  private static int[] sort(int[] scores) {
    int length = scores.length;
    for (int i = 0; i < length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < length; j++) {
        if (scores[j] < scores[min]) {
          min = j;
        }
      }
      if (i != min) {
        int tmp = scores[i];
        scores[i] = scores[min];
        scores[min] = tmp;
      }
    }
    return scores;
  }
}
