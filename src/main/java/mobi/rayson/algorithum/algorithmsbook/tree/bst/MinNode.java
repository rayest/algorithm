package mobi.rayson.algorithum.algorithmsbook.tree.bst;

/**
 * @author lirui
 * find minimum node
 */
public class MinNode {
    public static void main(String[] args) {
        System.out.println(findMin(BaseBinarySearchTreeNode.init()));
        System.out.println(findMax(BaseBinarySearchTreeNode.init()));
        System.out.println(findMaxWithoutRecursion(BaseBinarySearchTreeNode.init()));
    }

    private static int findMaxWithoutRecursion(BinarySearchTreeNode node) {
        if(null == node){
            return Integer.MAX_VALUE;
        }
        while (node.getRight() != null){
            node = node.getRight();
        }
        return node.getData();
    }

    private static int findMax(BinarySearchTreeNode node) {
        if(null == node){
            return Integer.MAX_VALUE;
        }
        if (null == node.getRight()){
            return node.getData();
        }
        return findMax(node.getRight());
    }

    private static int findMin(BinarySearchTreeNode node) {
        if (node == null){
            return Integer.MIN_VALUE;
        }
        if (null == node.getLeft()){
            return node.getData();
        }
        return findMin(node.getLeft());
    }
}
