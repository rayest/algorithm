package mobi.rayson.algorithum.algorithmsbook.links;

import java.util.Arrays;
import java.util.List;

/**
 * @author lirui
 * 从链表尾部开始输出
 */
public class LinkListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        outputFromEnd(list, list.size());
    }

    private static void outputFromEnd(List<Integer> list, int size) {
        if (size == 0) {
            return;
        }
        System.out.println(list.get(size - 1));
        outputFromEnd(list, size - 1);
    }
}
