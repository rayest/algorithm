package mobi.rayson.algorithum.algorithmsbook.tree;

/**
 * @author lirui
 * 硬编码构造二叉树
 *              1
 *            /  \
 *          2    3
 *         / \
 *        4  5
 */
public class BaseBinaryTree {
    public static void main(String[] args) {
        System.out.println(getRootData());
    }

    private static int getRootData() {
        BinaryTreeNode binaryTree = initBinary();
        return binaryTree.getData();
    }

    public static BinaryTreeNode initBinary() {
        BinaryTreeNode root = new BinaryTreeNode();
        root.setData(1);

        BinaryTreeNode left = new BinaryTreeNode().setData(2);
        left.setLeft(new BinaryTreeNode().setData(4));
        left.setRight(new BinaryTreeNode().setData(5));

        root.setLeft(left);
        root.setRight(new BinaryTreeNode().setData(3));

        return root;
    }
}
