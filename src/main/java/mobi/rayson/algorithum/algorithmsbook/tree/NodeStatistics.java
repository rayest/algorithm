package mobi.rayson.algorithum.algorithmsbook.tree;

/**
 * @author lirui
 * 统计节点数
 */
public class NodeStatistics {
    public static void main(String[] args) {
        System.out.println(countNodes(BaseBinaryTree.initBinary()));
    }

    private static int countNodes(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null){
            return 0;
        }
        return countNodes(binaryTreeNode.getLeft()) + 1 + countNodes(binaryTreeNode.getRight());
    }
}
