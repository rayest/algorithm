package mobi.rayson.leetcode;

import java.util.HashMap;
import java.util.Map;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-23
 *  Time: 4:57 PM
 *  Description:
 **/
public class Demo_03 {
  public static void main(String[] args) {
    String a = "aab";
    System.out.println(findLongestSubstring(a));
  }

  private static int findLongestSubstring(String s) {
    int ans = 0;
    Map<Character, Integer> map = new HashMap<>(); // current index of character
    // try to extend the range [i, j]
    int i = 0;
    for (int j = 0; j < s.length(); j++) {
      if (map.containsKey(s.charAt(j))) {
        i = Math.max(map.get(s.charAt(j)), i);
      }
      ans = Math.max(ans, j - i + 1);
      map.put(s.charAt(j), j + 1);
    }
    return ans;
  }
}