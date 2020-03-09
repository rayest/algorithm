package mobi.rayson.algorithum.algorithmsbook.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lirui
 * 两种方式实现节点数值求和
 */
public class BinaryTreeNodeDataSum {
    public static void main(String[] args) {
        System.out.println(sumData(BaseBinaryTree.initBinary()));
        System.out.println(sumDataWithoutRecursion(BaseBinaryTree.initBinary()));
    }

    private static int sumDataWithoutRecursion(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return Integer.MIN_VALUE;
        }
        int sum = 0;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(binaryTreeNode);
        while (!queue.isEmpty()) {
            BinaryTreeNode temp = queue.poll();
            sum += temp.getData();
            if (temp.getLeft() != null) {
                queue.offer(temp.getLeft());
            }
            if (temp.getRight() != null) {
                queue.offer(temp.getRight());
            }
        }
        return sum;
    }

    private static int sumData(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return Integer.MIN_VALUE;
        }
        return binaryTreeNode.getData() + sumData(binaryTreeNode.getRight()) + sumData(binaryTreeNode.getLeft());
    }
}
