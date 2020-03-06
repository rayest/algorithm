package mobi.rayson.algorithum.algorithmsbook.queue;

import java.util.Collections;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author lirui
 * 逆转队列中的部分元素
 * from：1 2 3 4 5 6 7 8 9 10
 * to ： 5 4 3 2 1 6 7 8 9 10
 */
public class QueueReverseHalf {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(10);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.offer(8);
        queue.offer(9);
        queue.offer(10);
        Queue<Integer> reversedQueue = reverse(queue, 5);
        while (!reversedQueue.isEmpty()) {
            System.out.println(reversedQueue.poll());
        }
    }

    private static Queue<Integer> reverse(Queue<Integer> queue, int n) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        for (int i = 0; i < queue.size() - n; i++) {
            queue.offer(queue.remove());
        }

        return queue;
    }
}
