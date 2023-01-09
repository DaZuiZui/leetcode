import java.util.Stack;

public class P232 {
}

class MyQueue {
    Stack<Integer> a = new Stack<>();
    Stack<Integer> b = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        a.push(x);
    }

    public int pop() {
        if (b.isEmpty()){
            while (!a.isEmpty()){
                b.push(a.pop());
            }
        }

        return b.pop();
    }

    public int peek() {
        if (b.isEmpty()){
            while (!a.isEmpty()){
                b.push(a.pop());
            }
        }

        return b.peek();
    }

    public boolean empty() {
        return a.isEmpty() && b.isEmpty();
    }
}
