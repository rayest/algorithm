package mobi.rayson.algorithum.algorithmsbook.tree;

/**
 * @author lirui
 * 递归遍历二叉树
 */
public class BinaryTreeTraversal {
    public static void main(String[] args) {
        BinaryTreeNode binaryTree = BaseBinaryTree.initBinary();

        System.out.println("====前序遍历====");
        preOrder(binaryTree);

        System.out.println("====中序遍历====");
        inorder(binaryTree);

        System.out.println("====后序遍历====");
        postOrder(binaryTree);
    }

    private static void preOrder(BinaryTreeNode binaryTree) {
        if (binaryTree != null) {
            System.out.println(binaryTree.getData());
            preOrder(binaryTree.getLeft());
            preOrder(binaryTree.getRight());
        }
    }

    private static void inorder(BinaryTreeNode binaryTree) {
        if (binaryTree != null) {
            inorder(binaryTree.getLeft());
            System.out.println(binaryTree.getData());
            inorder(binaryTree.getRight());
        }
    }

    private static void postOrder(BinaryTreeNode binaryTree) {
        if (binaryTree != null) {
            postOrder(binaryTree.getLeft());
            postOrder(binaryTree.getRight());
            System.out.println(binaryTree.getData());
        }
    }
}
