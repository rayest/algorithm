package mobi.rayson.algorithum.algorithmsbook.tree.bst;

/**
 * @author lirui
 * 二叉搜索树：left < current node < right
 *  *              3
 *  *            /  \
 *  *          2    5
 *  *         /    /
 *  *       1    4
 */
public class BinarySearchTreeNode {
    private int data;
    private BinarySearchTreeNode left;
    private BinarySearchTreeNode right;

    public int getData() {
        return data;
    }

    public BinarySearchTreeNode setData(int data) {
        this.data = data;
        return this;
    }

    public BinarySearchTreeNode getLeft() {
        return left;

    }

    public BinarySearchTreeNode setLeft(BinarySearchTreeNode left) {
        this.left = left;
        return this;
    }

    public BinarySearchTreeNode getRight() {
        return right;
    }

    public BinarySearchTreeNode setRight(BinarySearchTreeNode right) {
        this.right = right;
        return this;
    }
}
