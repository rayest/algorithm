package mobi.rayson.algorithum.algorithmsbook.tree.generaltree;

/**
 * @author lirui
 * 硬编码构造通用树
 *              1
 *  箭头      /
 *          2 --> 3 --> 5
 *  箭头         /
 *             4 --> 6
 */
public class GeneralTreeNode {
    private int data;
    private GeneralTreeNode firstChild;
    private GeneralTreeNode nextSibling;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public GeneralTreeNode getFirstChild() {
        return firstChild;
    }

    public void setFirstChild(GeneralTreeNode firstChild) {
        this.firstChild = firstChild;
    }

    public GeneralTreeNode getNextSibling() {
        return nextSibling;
    }

    public void setNextSibling(GeneralTreeNode nextSibling) {
        this.nextSibling = nextSibling;
    }
}
