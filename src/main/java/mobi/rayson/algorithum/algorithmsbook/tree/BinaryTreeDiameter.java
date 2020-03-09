package mobi.rayson.algorithum.algorithmsbook.tree;

/**
 * @author lirui
 * 二叉树直径
 */
public class BinaryTreeDiameter {
    public static void main(String[] args) {
        System.out.println(diameter(BaseBinaryTree.initBinary(), 1));
    }

    private static int diameter(BinaryTreeNode binaryTreeNode, int diameter) {
        if (binaryTreeNode == null) {
            return 0;
        }
        int left = diameter(binaryTreeNode.getLeft(), diameter);
        int right = diameter(binaryTreeNode.getRight(), diameter);
        if (left + right > diameter) {
            diameter = left + right;
        }
        return Math.max(right, left) + 1;
    }
}
