public class QUES3 {
    public void concatenate(LinkedQueue<E> Q2) {
        if (Q2.isEmpty()) {
            // if Q2 is empty, nothing to concatenate, return
            return;
        }
        if (isEmpty()) {
            // if the current queue is empty, just copy the elements of Q2 to the current queue
            front = Q2.front;
        } else {
            // if both queues have elements, concatenate the two queues
            rear.next = Q2.front;
        }
        rear = Q2.rear;
        size += Q2.size();
        Q2.front = null;
        Q2.rear = null;
        Q2.setSize(0);
    }
```

    Here's how the method works:


}
