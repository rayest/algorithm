package mobi.rayson.algorithum.algorithmsbook.tree;

/**
 * @author lirui
 * 删除二叉树
 * 1. 删除左子树
 * 2. 删除右子树
 * 3. 删除根节点
 * 4. 递归整棵树
 */
public class BinaryTreeDelete {
    public static void main(String[] args) {
        delete(BaseBinaryTree.initBinary());
    }

    private static void delete(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return;
        }
        delete(binaryTreeNode.getLeft());
        delete(binaryTreeNode.getRight());
        // 垃圾回收掉
        binaryTreeNode = null;
    }
}
