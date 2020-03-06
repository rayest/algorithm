package mobi.rayson.algorithum.algorithmsbook.stack;

import java.util.Enumeration;
import java.util.Random;
import java.util.Stack;

/**
 * @author lirui
 * get minimum element in current stack
 * 1. 核心栈 mainStack
 * 2. 辅助栈 minStack
 */
public class StackMin {
    public static void main(String[] args) {
        min();
    }

    private static void min() {

        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        for (int i = 0; i < 9; i++) {
            Random random = new Random();
            int element = random.nextInt(9);
            mainStack.push(element);
            if (minStack.isEmpty()) {
                minStack.push(element);
            } else {
                if (minStack.lastElement() > element) {
                    minStack.push(element);
                }
            }
        }

        Enumeration<Integer> mainElements = mainStack.elements();
        while (mainElements.hasMoreElements()) {
            System.out.println("all main: " + mainElements.nextElement());
        }

        Enumeration<Integer> minElements = minStack.elements();
        while (minElements.hasMoreElements()) {
            System.out.println("all min: " + minElements.nextElement());
        }
    }
}
