package mobi.rayson.algorithum.algorithmsbook.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lirui
 * 统计树的叶子节点数
 */
public class BinaryTreeLeaves {
    public static void main(String[] args) {
        System.out.println(countLeaves(BaseBinaryTree.initBinary()));
    }

    private static int countLeaves(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return 0;
        }
        int count = 0;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(binaryTreeNode);
        while (!queue.isEmpty()) {
            BinaryTreeNode treeNode = queue.poll();
            if (treeNode.getLeft() == null && treeNode.getRight() == null) {
                count++;
            } else {
                if (treeNode.getLeft() != null) {
                    queue.offer(treeNode.getLeft());
                }
                if (treeNode.getRight() != null) {
                    queue.offer(treeNode.getRight());
                }
            }
        }
        return count;
    }
}
