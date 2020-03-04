package mobi.rayson.algorithum.algorithmsbook.links;

import java.util.concurrent.Semaphore;

public class ListNode {

    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
        Semaphore semaphore = new Semaphore(10);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    private int size(ListNode headNode){
        int length = 0;
        ListNode currentNode = headNode;
        while (currentNode != null){
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }
}
