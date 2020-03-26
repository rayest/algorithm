package mobi.rayson.algorithum.algorithmsbook.tree.binarytree;

/**
 * @author lirui
 * 统计树高/深度
 */
public class BinaryTreeHeight {
    public static void main(String[] args) {
        System.out.println(binaryTreeHeight(BaseBinaryTree.initBinary()));
    }

    private static int binaryTreeHeight(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return 0;
        }
        int leftHeight = binaryTreeHeight(binaryTreeNode.getLeft());
        int rightHeight = binaryTreeHeight(binaryTreeNode.getRight());
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }
}
