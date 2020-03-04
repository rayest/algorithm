package mobi.rayson.algorithum.leetcode;


import mobi.rayson.algorithum.annotation.Note;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-22
 *  Time: 3:33 PM
 *  Description: 给定的数组及元素 [1,2,3,4,5]，找出其中两个元素，和为指定的结果
 **/
public class Demo_01 {
    public static void main(String[] args) {
        int[] origin = {-3, 4, 3, 90};
        int target = 0;
        int[] index = selectTwo(origin, target);
        System.out.println(Arrays.toString(index));
    }

    @Note("暴力解法，两个循环逐个比较相加。时间复杂度 O(n^2)")
    private static int[] select(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];
                if ((a + b) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    @Note("使用 HashMap，List 的值作为 map 的 key")
    private static int[] selectTwo(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solutions.");
    }
}
