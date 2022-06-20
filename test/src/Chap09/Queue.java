package Chap09;

public class Queue {
    private static int MAX = 100000;

    static int[] qu = new int[MAX];
    static int tail = 0, head = 0;
    public static void main(String[] args) throws Exception {
        init();

        enqueue(3);
        enqueue(5);
        enqueue(7);

        System.out.println(dequeue());
        System.out.println(dequeue());

        enqueue(9);
    }

    public static void init() {
        head = tail = 0;
    }

    public static Boolean isEmpty() {
        return (head == tail);
    }

    public static Boolean isFull() {
        return (head == (tail + 1) % MAX);
    }

    public static void enqueue(int x) {
        if (isFull()) {
            System.out.println("error: queue is full");
            return;
        }
        qu[tail] = x;
        tail++;
        if (tail == MAX) { // 링버퍼에 도달했으면 0
            tail = 0;
        }
    }

    public static int dequeue() {
        if (isEmpty()) {
            System.out.println("error: queue is empty");
            return -1;
        }
        int res = qu[head];
        head++;
        if (head == MAX) { // 링버퍼에 도달했으면 0
            head = 0;
        }
        return res;
    }
}
