package mobi.rayson.algorithum.algorithmsbook.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lirui
 * 查找最深节点
 */
public class DeepestNode {
    public static void main(String[] args) {
        System.out.println(findDeepestNode(BaseBinaryTree.initBinary()));
    }

    private static BinaryTreeNode findDeepestNode(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return null;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(binaryTreeNode);
        BinaryTreeNode deepestNode = null;
        while (!queue.isEmpty()) {
            deepestNode = queue.poll();
            if (deepestNode.getRight() != null) {
                queue.offer(deepestNode.getRight());
            }
            if (deepestNode.getLeft() != null) {
                queue.offer(deepestNode.getLeft());
            }
        }
        return deepestNode;
    }
}
