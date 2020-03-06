package mobi.rayson.algorithum.algorithmsbook.queue;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author lirui
 * 逆转队列中的元素
 */
public class QueueReverse {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        Queue<Integer> reversedQueue = reverse(queue);
        while (!reversedQueue.isEmpty()) {
            System.out.println(reversedQueue.poll());
        }
    }

    private static Queue<Integer> reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()){
            queue.offer(stack.pop());
        }
        return queue;
    }
}
