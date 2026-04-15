package Queue_Examples;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linked_List {
    
    private Node root;

    void insert_left(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
        } else {
            n.next = root;
            root = n;
        }
    }

    void delete_left() {
        if (root == null) {
            System.out.print("Empty list.");
        } else {
            Node t = root;
            root = root.next;
            System.out.print("\nDeleted:" + t.data);
        }
    }

    void print_list() {
        if (root == null) {
            System.out.print("Empty list.");
        } else {
            Node t = root;
            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
            System.out.print("NULL");
        }
    }

    public static void main(String[] args) {
        Linked_List obj = new Linked_List();

        obj.insert_left(100);
        obj.insert_left(80);
        obj.insert_left(60);
        obj.insert_left(40);
        obj.insert_left(20);
        obj.insert_left(10);

        System.out.print("\nList has:\n");
        obj.print_list();

        obj.delete_left();
        obj.delete_left();

        System.out.print("\nList has:\n");
        obj.print_list();
    }
}