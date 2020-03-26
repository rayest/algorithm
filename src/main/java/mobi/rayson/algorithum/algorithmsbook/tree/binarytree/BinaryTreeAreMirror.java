package mobi.rayson.algorithum.algorithmsbook.tree.binarytree;

/**
 * @author lirui
 * 判断两个树是否互为镜像
 */
public class BinaryTreeAreMirror {
    public static void main(String[] args) {
        System.out.println(areMirror(BaseBinaryTree.initBinary(), BaseBinaryTree.initBinary()));
    }

    private static boolean areMirror(BinaryTreeNode tree1, BinaryTreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }
        if (tree1 == null || tree2 == null) {
            return false;
        }
        return (tree1.getData() == tree2.getData())
                && areMirror(tree1.getLeft(), tree2.getRight())
                && areMirror(tree1.getRight(), tree2.getLeft());
    }
}
