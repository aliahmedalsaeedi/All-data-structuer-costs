import org.w3c.dom.Node;

public class Ques3 {
    public <E> void addFirst(E e) {
        int size;
        Node<> tail; if (size == 0) {
            tail = new Node(e, null) {
                @Override
                public String getNodeName() {
                    return null;
                }
            };
            tail.setNext(tail);
        } else {
            tail.setNext(new Node<>(e, tail.getNext()));

        }
