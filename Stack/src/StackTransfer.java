
import java.util.Stack;
public class StackTransfer {


    public static void transfer(Stack<Integer> S, Stack<Integer> T) {
        // Transfer elements from S to T
        while (!S.isEmpty()) {
            T.push(S.pop());
        }
    }

    public static void main(String[] args) {
        // Create two stacks
        Stack<Integer> S = new Stack<>();
        Stack<Integer> T = new Stack<>();

        S.push(1);                  // Push elements onto S
        S.push(2);
        S.push(3);

        transfer(S, T);             // Transfer elements from S to T

        while (!T.isEmpty()) {      // Print elements in T
            System.out.println(T.pop());
        }
    }

}
