package mobi.rayson.sort;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2018-12-09
 *  Time: 10:06 PM
 *  Description: 排序算法
 **/
public class BubbleSort {
  public static void main(String[] args) {
    int[] scores = new int[] {1, 6, 2, 0, 3, 7, 10, 54, 37, 85, 9};
    int[] sortedScores = sort(scores);
    for (int i : sortedScores) {
      System.out.print(i + " ");
    }
  }

  public static int[] sort(int[] scores) {
    int length = scores.length;
    if (length <= 1) return scores;
    for (int i = 0; i < length; i++) {
      boolean flag = false;
      for (int j = 0; j < length - i - 1; j++) {
        if (scores[j] > scores[j + 1]) {
          int tmp = scores[j];
          scores[j] = scores[j + 1];
          scores[j + 1] = tmp;
          flag = true;
        }
      }
      if (!flag) break;
    }
    return scores;
  }
}
