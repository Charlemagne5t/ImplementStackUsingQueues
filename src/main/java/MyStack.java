import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> queue;
    private Queue<Integer> temp;

    public MyStack() {
        queue = new LinkedList<>();
        temp = new LinkedList<>();
    }

    public void push(int x) {
        temp.add(x);
        while (!queue.isEmpty()){
            temp.add(queue.poll());
        }
        while (!temp.isEmpty()){
            queue.add(temp.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
