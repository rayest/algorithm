package mobi.rayson.algorithum.algorithmsbook.tree;

/**
 * @author lirui
 * 判断两棵树是否相等
 */
public class BinaryTreeSame {
    public static void main(String[] args) {
        System.out.println(isTreeEquals(BaseBinaryTree.initBinary(), BaseBinaryTree.initBinary()));
    }

    private static boolean isTreeEquals(BinaryTreeNode tree1, BinaryTreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }
        if (tree1 == null || tree2 == null) {
            return false;
        }
        return tree1.getData() == tree2.getData()
                && (isTreeEquals(tree1.getLeft(), tree2.getLeft()))
                && (isTreeEquals(tree1.getLeft(), tree2.getLeft()));
    }
}
