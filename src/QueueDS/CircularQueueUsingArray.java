package QueueDS;

public class CircularQueueUsingArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        // is Empty()
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // isFull()
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Enqueue (to add the elements) O(1)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // first element add
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Dequeue (to remove the element) O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek operation
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
