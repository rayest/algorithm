package mobi.rayson.algorithum.algorithmsbook.tree.bst;

/**
 * @author lirui
 * 查询 data 为 3 的节点是否存在: log2n
 */
public class BSTIsExist {
    public static void main(String[] args) {
        BinarySearchTreeNode node = BaseBinarySearchTreeNode.init();
        System.out.println(isExist(node, 6));
    }

    private static boolean isExist(BinarySearchTreeNode node, int data) {
        if (node == null) {
            return false;
        }
        if (node.getData() == data) {
            return true;
        }
        return data < node.getData() ? isExist(node.getLeft(), data) : isExist(node.getRight(), data);
    }
}
