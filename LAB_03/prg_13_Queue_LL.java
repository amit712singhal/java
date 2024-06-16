package LAB_03;

class Q_Node {
    int data;
    Q_Node next;

    public Q_Node(int d) {
        data = d;
        next = null;
    }
}

public class prg_13_Queue_LL {
    static class Queues {
        public static Q_Node Front;
        public static Q_Node Rear;
        public static int Size;

        boolean IsEmpty() {
            return (Rear == null);
        }

        void Enqueue(int data) {
            Q_Node NewNode = new Q_Node(data);
            if (IsEmpty()) {
                Front = Rear = NewNode;
                Size++;
                return;
            }
            Rear.next = NewNode;
            Rear = NewNode;
            Size++;
        }

        void Dequeue() {
            if (IsEmpty()) {
                System.out.println("THE STACK IS EMPTY , DELETION NOT POSSIBLE");
                return;
            }
            Q_Node Temp = Front;
            Front = Front.next;
            Temp.next = null;
            Size--;
        }

        void Peek_First() {
            if (IsEmpty()) {
                System.out.println("THE QUEUE IS EMPTY , PEEK NOT POSSIBLE");
                return;
            }
            System.out.println("THE FRONT OF THE QUEUE IS ::: " + Front.data);
        }

        void Peek_Last() {
            if (IsEmpty()) {
                System.out.println("THE QUEUE IS EMPTY , PEEK NOT POSSIBLE");
                return;
            }
            System.out.println("THE REAR OF THE QUEUE IS ::: " + Rear.data);
        }

        void Size_Queue() {
            System.out.println("THE SIZE OF THE QUEUE IS ::: " + Size);
        }

        void Display() {
            System.out.print("THE QUEUE IS ::: (Front) --> ");
            Q_Node temp = Front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("<-- (Rear)");
        }
    }

    public static void main(String args[]) {
        Queues q = new Queues();
        System.out.println();
        System.out.println();
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        q.Display();
        q.Dequeue();
        q.Display();
        q.Peek_First();
        q.Peek_Last();
        q.Size_Queue();
        System.out.println();
    }
}