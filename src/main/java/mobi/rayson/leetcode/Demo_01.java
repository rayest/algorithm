package mobi.rayson.leetcode;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-22
 *  Time: 3:33 PM
 *  Description: 给定的数组及元素，找出其中两个元素，和为指定的结果
 **/
public class Demo_01 {
  public static void main(String[] args) {
    int[] origin = {-3, 4, 3, 90};
    int target = 0;
    int[] index = select(origin, target);
    System.out.println(index[0]);
    System.out.println(index[1]);
  }

  private static int[] select(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      int a = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        int b = nums[j];
        if ((a + b) == target) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {-1, -1};
  }
}