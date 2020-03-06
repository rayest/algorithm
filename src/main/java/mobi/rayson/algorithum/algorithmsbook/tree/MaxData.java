package mobi.rayson.algorithum.algorithmsbook.tree;

/**
 * @author lirui
 * 查找二叉树节点中最大值data
 */
public class MaxData {
    public static void main(String[] args) {
        BinaryTreeNode binaryTreeNode = BaseBinaryTree.initBinary();
        System.out.println(findMax(binaryTreeNode));
    }

    private static int findMax(BinaryTreeNode binaryTreeNode) {
        int rootData;
        int leftMax;
        int rightMax;
        int max = Integer.MIN_VALUE;
        if (binaryTreeNode != null) {
            rootData = binaryTreeNode.getData();
            leftMax = findMax(binaryTreeNode.getLeft());
            rightMax = findMax(binaryTreeNode.getRight());
            max = Math.max(leftMax, rightMax);
            if (rootData > max) {
                max = rootData;
            }
        }
        return max;
    }
}
