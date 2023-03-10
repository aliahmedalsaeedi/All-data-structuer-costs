import java.util.Stack;

public class StackMethod {
    Stack<Integer>jalal= new Stack<>();
    public static void removeAllElements(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            stack.pop();                            // remove the top element
            removeAllElements(stack);                // recursively remove the rest of the elements
        }

    }
}

