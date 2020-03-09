package mobi.rayson.algorithum.algorithmsbook.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lirui
 * 统计节点数
 */
public class NodeStatistics {
    public static void main(String[] args) {
        System.out.println(countNodes(BaseBinaryTree.initBinary()));
        System.out.println(countNodesWithNoRecursion(BaseBinaryTree.initBinary()));
    }

    private static int countNodesWithNoRecursion(BinaryTreeNode binaryTree) {
        if (binaryTree == null) {
            return 0;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(binaryTree);
        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            BinaryTreeNode temp = queue.poll();
            if (temp.getLeft() != null) {
                queue.offer(temp.getLeft());
            }
            if (temp.getRight() != null) {
                queue.offer(temp.getRight());
            }
        }
        return count;
    }

    private static int countNodes(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return 0;
        }
        return countNodes(binaryTreeNode.getLeft()) + 1 + countNodes(binaryTreeNode.getRight());
    }
}
