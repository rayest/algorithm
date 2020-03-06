package mobi.rayson.algorithum.algorithmsbook.stack;

import java.util.Stack;

/**
 * @author lirui
 * 栈排序，通过辅助栈
 */
public class StackOrder {
    public static void main(String[] args) {
        Stack<Integer> integers = orderStack();
        while (!integers.isEmpty()) {
            System.out.println(integers.pop());
        }
    }

    private static Stack<Integer> orderStack() {
        Stack<Integer> mainStack = new Stack<>();
        mainStack.push(1);
        mainStack.push(5);
        mainStack.push(3);
        mainStack.push(2);
        mainStack.push(4);

        Stack<Integer> helpStack = new Stack<>();

        while (!mainStack.isEmpty()) {
            Integer current = mainStack.pop();
            while (!helpStack.isEmpty() && helpStack.peek() < current) {
                mainStack.push(helpStack.pop());
            }
            helpStack.push(current);
        }

        while (!helpStack.isEmpty()) {
            mainStack.push(helpStack.pop());
        }
        return mainStack;
    }
}
