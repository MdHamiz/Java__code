package introtopic;

public class stackbasic {
    public static void main(String[] args) {
        class Stack {
            private int arr[];
            private int top;
            private int capacity;

            // Constructor to initialize stack
            Stack(int size) {
                arr = new int[size];
                capacity = size;
                top = -1;
            }

            // Push an element onto the stack
            public void push(int x) {
                if (isFull()) {
                    System.out.println("Stack Overflow");
                    return;
                }
                arr[++top] = x;
            }

            // Pop an element from the stack
            public int pop() {
                if (isEmpty()) {
                    System.out.println("Stack Underflow");
                    return -1;
                }
                return arr[top--];
            }

            // Peek top element
            public int peek() {
                if (isEmpty()) {
                    System.out.println("Stack is Empty");
                    return -1;
                }
                return arr[top];
            }

            // Check if stack is empty
            public boolean isEmpty() {
                return top == -1;
            }

            // Check if stack is full
            public boolean isFull() {
                return top == capacity - 1;
            }

            // Display stack elements
            public void display() {
                if (isEmpty()) {
                    System.out.println("Stack is Empty");
                    return;
                }
                System.out.print("Stack elements: ");
                for (int i = 0; i <= top; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }

            public static void main(String[] args) {
                Stack stack = new Stack(5);

                stack.push(10);
                stack.push(20);
                stack.push(30);

                stack.display();

                System.out.println("Top element: " + stack.peek());
                System.out.println("Popped element: " + stack.pop());
                stack.display();
            }
        }

    }
}
