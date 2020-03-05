package mobi.rayson.algorithum.algorithmsbook.links;

import java.util.Arrays;
import java.util.List;

/**
 * @author lirui
 * 寻找模节点，从头开始寻找，返回最后一个 i % k == 0 的节点
 */
public class LinkListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        System.out.println(last(list, 3));
    }

    private static int last(List<Integer> list, int k) {
        if (k <= 0) {
            return 0;
        }
        int result = 0;
        for (Integer value : list) {
            if (value % k == 0){
                result = value;
            }
        }
        return result;
    }
}
