package LAB_03;

class Node {
    int data;
    Node next;

    public Node(int d) {
        data = d;
        next = null;
    }
}

public class prg_12_Stack_LL {
    static class Stacks {
        public static Node Top;
        public static int Size;

        boolean IsEmpty() {
            return (Top == null);
        }

        void Push(int data) {
            Node NewNode = new Node(data);
            if (IsEmpty()) {
                Top = NewNode;
                Size++;
                return;
            }
            NewNode.next = Top;
            Top = NewNode;
            Size++;
        }

        void Pop() {
            if (IsEmpty()) {
                System.out.println("THE STACK IS EMPTY , DELETION NOT POSSIBLE");
                return;
            }
            Node Temp = Top;
            Top = Top.next;
            Temp.next = null;
            Size--;
        }

        void Peek() {
            if (IsEmpty()) {
                System.out.println("THE STACK IS EMPTY , PEEK NOT POSSIBLE");
                return;
            }
            System.out.println("THE TOP OF THE IS ::: " + Top.data);
        }

        void Size_Stack() {
            System.out.println("THE SIZE OF THE STACK IS ::: " + Size);
        }

        void Display() {
            System.out.print("THE STACK IS ::: (Top) --> ");
            Node temp = Top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Stacks S1 = new Stacks();
        System.out.println();
        System.out.println();
        S1.Push(1);
        S1.Push(2);
        S1.Push(3);
        S1.Push(4);
        S1.Push(5);
        S1.Display();
        S1.Pop();
        S1.Display();
        S1.Peek();
        S1.Size_Stack();
        System.out.println();
    }
}