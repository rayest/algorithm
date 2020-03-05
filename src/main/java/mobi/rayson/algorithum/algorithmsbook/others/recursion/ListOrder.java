package mobi.rayson.algorithum.algorithmsbook.others.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lirui
 * 数组或者列表中元素是否是有序的：冒泡比较或者递归
 */
public class ListOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 8, 5);
        System.out.println(isListOrdered(list, list.size()));
    }

    private static boolean isListOrdered(List<Integer> list, int size) {
        if (size == 1) {
            return true;
        }
        return list.get(size - 1) > list.get(size - 2) && isListOrdered(list, size - 1);
    }
}
