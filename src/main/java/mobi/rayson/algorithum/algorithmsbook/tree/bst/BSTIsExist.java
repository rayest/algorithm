package mobi.rayson.algorithum.algorithmsbook.tree.bst;

/**
 * @author lirui
 * 查询 data 为 3 的节点是否存在: log2n
 */
public class BSTIsExist {
    public static void main(String[] args) {
        BinarySearchTreeNode node = BaseBinarySearchTreeNode.init();
        System.out.println(isExist(node, 5));
        System.out.println(isExistWithoutRecursion(node, 6));
    }

    private static boolean isExistWithoutRecursion(BinarySearchTreeNode node, int data) {
        if (node == null) {
            return false;
        }
        while (node != null) {
            if (data == node.getData()) {
                return true;
            }
            if (data > node.getData()) {
                node = node.getRight();
            } else {
                node = node.getLeft();
            }
        }
        return false;
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
