package mobi.rayson.algorithum.algorithmsbook.tree.bst;

/**
 * @author lirui
 * 硬编码构造二叉搜索树
 *  *              3
 *  *            /  \
 *  *          2    5
 *  *         /    /
 *  *       1    4
 */
public class BaseBinarySearchTreeNode {
    public static void main(String[] args) {
        System.out.println(getRootData());
    }

    private static int getRootData() {
        BinarySearchTreeNode binaryTree = new BinarySearchTreeNode();
        return binaryTree.getData();
    }

    public static BinarySearchTreeNode init() {
        BinarySearchTreeNode root = new BinarySearchTreeNode();
        root.setData(3);

        BinarySearchTreeNode left = new BinarySearchTreeNode().setData(2);
        left.setLeft(new BinarySearchTreeNode().setData(1));
        root.setLeft(left);

        BinarySearchTreeNode right = new BinarySearchTreeNode().setData(5);
        right.setLeft(new BinarySearchTreeNode().setData(4));
        root.setRight(right);

        return root;
    }
}
