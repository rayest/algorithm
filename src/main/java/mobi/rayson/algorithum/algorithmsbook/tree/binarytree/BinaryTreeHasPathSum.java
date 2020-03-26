package mobi.rayson.algorithum.algorithmsbook.tree.binarytree;

/**
 * @author lirui
 * 是否存在一条路径，使得路径上各个节点值的总和等于给定值
 */
public class BinaryTreeHasPathSum {
    public static void main(String[] args) {
        System.out.println(hasPathSum(BaseBinaryTree.initBinary(), 10));
        System.out.println(hasPathSum(BaseBinaryTree.initBinary(), 8));
    }

    private static boolean hasPathSum(BinaryTreeNode binaryTreeNode, int sum) {
        if (binaryTreeNode == null) {
            return sum == 0;
        }
        int subSum = sum - binaryTreeNode.getData();
        return hasPathSum(binaryTreeNode.getLeft(), subSum) || hasPathSum(binaryTreeNode.getRight(), subSum);
    }
}
