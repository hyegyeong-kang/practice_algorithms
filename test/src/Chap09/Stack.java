package Chap09;

public class Stack {
    private static int MAX = 100000;

    static int[] st = new int[MAX];
    static int top = 0;
    public static void main(String[] args) throws Exception {
        init();

        push(3);
        push(5);
        push(7);

        System.out.println(pop());
        System.out.println(pop());

        push(9);
    }

    public static void init() {
        top = 0;
    }

    public static Boolean isEmpty() {
        return (top == 0);
    }

    public static Boolean isFull() {
        return (top == MAX);
    }

    public static void push(int x) {
        if (isFull()) {
            System.out.println("error: stack is full");
            return;
        }
        st[top] = x;
        top++;
    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("error: stack is empty");
            return -1;
        }
        top--;
        return st[top];
    }
}
