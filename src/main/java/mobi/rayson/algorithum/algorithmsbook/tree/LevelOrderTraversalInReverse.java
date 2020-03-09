package mobi.rayson.algorithum.algorithmsbook.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author lirui
 * 逆向逐层输出树中节点数据
 * 4 5 2 3 1
 */
public class LevelOrderTraversalInReverse {
    public static void main(String[] args) {
        printInReversal(BaseBinaryTree.initBinary());
    }

    private static void printInReversal(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        queue.offer(binaryTreeNode);
        while (!queue.isEmpty()) {
            BinaryTreeNode temp = queue.poll();
            if (temp.getRight() != null) {
                queue.offer(temp.getRight());
            }
            if (temp.getLeft() != null) {
                queue.offer(temp.getLeft());
            }
            stack.push(temp);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().getData());
        }
    }
}
