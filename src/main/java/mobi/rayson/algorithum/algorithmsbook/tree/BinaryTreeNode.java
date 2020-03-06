package mobi.rayson.algorithum.algorithmsbook.tree;

/**
 * @author lirui
 * 自定义二叉树结构
 */
public class BinaryTreeNode {
    private int data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public int getData() {
        return data;
    }

    public BinaryTreeNode setData(int data) {
        this.data = data;
        return this;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode setLeft(BinaryTreeNode left) {
        this.left = left;
        return this;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public BinaryTreeNode setRight(BinaryTreeNode right) {
        this.right = right;
        return this;
    }
}
