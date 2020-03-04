package mobi.rayson.algorithum.datastructure.binarysorttree;


import mobi.rayson.algorithum.annotation.Note;

@Note("二叉查找树/二叉搜索树/二叉排序树：left < center < right")
public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void insert(int value){

    }
}
