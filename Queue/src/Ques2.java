import java.util.Queue;

public abstract class Ques2<E> implements Queue<E>, Cloneable {
    private E[] elements;
    private int head;
    private int tail;
    private int size;

    public void ArrayQueue(int capacity) {
        elements = (E[]) new Object[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    // Other methods of the ArrayQueue class

    @Override
    public ArrayQueue<E> clone() {
        try {
            ArrayQueue<E> clonedQueue = (ArrayQueue<E>) super.clone();
            clonedQueue.elements = elements.clone();
            return clonedQueue;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public void clear() {


    }
}


