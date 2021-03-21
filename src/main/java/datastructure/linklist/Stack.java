package datastructure.linklist;

/**
 * https://www.youtube.com/watch?v=X7asXkoYWCQ&list=PLqq-6Pq4lTTZgXnsBNQwCWdKR6O6Cgk1Z&index=4
 */
public class Stack {
    private int top;
    private int capacity;
    private int[] array;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    public void push(int data) {
        if (isStackFull()) {
            throw new RuntimeException("Stack is full");
        }
        array[++top] = data;
    }

    public int pop() {
        if (isStackEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
    }

    public int peek() {
        if (isStackEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top];
    }

    private boolean isStackFull() {
        return top == capacity - 1;
    }

    private boolean isStackEmpty() {
        return top == -1;
    }

}
