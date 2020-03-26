package mobi.rayson.algorithum.algorithmsbook.tree.binarytree;

/**
 * @author lirui
 * 给定的值是否存在于二叉树中
 */
public class DataExist {
    public static void main(String[] args) {
        BinaryTreeNode binaryTreeNode = BaseBinaryTree.initBinary();
        System.out.println(isDataExist(2, binaryTreeNode));
        System.out.println(isDataExist(8, binaryTreeNode));
    }

    private static boolean isDataExist(int data, BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return false;
        }
        if (data == binaryTreeNode.getData()) {
            return true;
        }
        if (isDataExist(data, binaryTreeNode.getLeft())){
            return true;
        }
        return isDataExist(data, binaryTreeNode.getRight());
    }
}
