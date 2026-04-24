package Linked_List;
import java.util.Scanner;
public class LinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node root;

    // Insert at beginning
    void insert_left(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
        } else {
            n.next = root;
            root = n;
        }
    }

    // Insert at end
    void insert_right(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
        } else {
            Node t = root;
            while (t.next != null)
                t = t.next;
            t.next = n;
        }
    }

    // Delete from beginning
    void delete_left() {
        if (root == null) {
            System.out.println("Empty list.");
        } else {
            System.out.println("Deleted: " + root.data);
            root = root.next;
        }
    }

    // Delete from end
    void delete_right() {
        if (root == null) {
            System.out.println("Empty list.");
        } else if (root.next == null) {
            System.out.println("Deleted: " + root.data);
            root = null;
        } else {
            Node t = root;
            Node prev = null;

            while (t.next != null) {
                prev = t;
                t = t.next;
            }

            System.out.println("Deleted: " + t.data);
            prev.next = null;
        }
    }

    // Search element
    void search_list(int key) {
        if (root == null) {
            System.out.println("Empty list.");
        } else {
            Node t = root;
            while (t != null) {
                if (t.data == key) {
                    System.out.println(key + " Found");
                    return;
                }
                t = t.next;
            }
            System.out.println(key + " Not Found");
        }
    }

    // Print list
    void print_list() {
        if (root == null) {
            System.out.println("Empty list.");
            return;
        }

        Node t = root;
        while (t != null) {
            System.out.print("|" + t.data + "|->");
            t = t.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList obj = new LinkedList();

        int choice, e;

        do {
            System.out.println("\nLinked List Menu");
            System.out.println("=================");
            System.out.println("1. Insert Left");
            System.out.println("2. Insert Right");
            System.out.println("3. Delete Left");
            System.out.println("4. Delete Right");
            System.out.println("5. Search");
            System.out.println("6. Print List");
            System.out.println("7. Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element: ");
                    e = sc.nextInt();
                    obj.insert_left(e);
                    break;

                case 2:
                    System.out.print("Enter element: ");
                    e = sc.nextInt();
                    obj.insert_right(e);
                    break;

                case 3:
                    obj.delete_left();
                    break;

                case 4:
                    obj.delete_right();
                    break;

                case 5:
                    System.out.print("Enter element to search: ");
                    e = sc.nextInt();
                    obj.search_list(e);
                    break;

                case 6:
                    obj.print_list();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
