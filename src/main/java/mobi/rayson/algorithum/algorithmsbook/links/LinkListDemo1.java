package mobi.rayson.algorithum.algorithmsbook.links;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author lirui
 * 获取链表的倒数第n个节点数据
 * 1 2 3 4 5 倒数第三个为 3
 */
public class LinkListDemo1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(daoshu(list, 3));
    }

    private static Integer daoshu(LinkedList<Integer> list, int i) {
        System.out.println(list.get(list.size() - i));
        // 2. 或者如下方法
        HashMap<Integer, Integer> map = new HashMap<>(8);
        for (Integer value : list) {
            map.put(list.indexOf(value), value);
        }
        return map.get(map.size() - i);
    }
}
