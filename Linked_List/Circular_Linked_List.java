package Linked_List;

import java.util.Scanner;

public class Circular_Linked_List {

	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}



    private Node root,last;

    void insert_left(int data) {
        Node n = new Node(data);
        if (root == null) {
            root =last = n;
            last.next = root;
        } else {
            n.next = root;
            root = n;
            last.next = root;
        }
    }

    void delete_left() {
        if (root == null) {
            System.out.println("Empty list.");
        } else if (root == last ){
            System.out.println("Deleted :" + root.data);
            root = last = null;
        } else {
            System.out.println("Deleted: " + root.data);
            root = root.next;
            last.next = root;
        }
    }

    void insert_right(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = last =n;
            last.next = root;
        } else {
           last.next=n;
           last=n;
           last.next=root;
        }
    }

    void delete_right() {
        if (root == null) {
            System.out.println("Empty list.");
        } else if (root == last) {
            System.out.println("Deleted: " + root.data);
            root = last = null;
        } else {
            Node t = root;
            while (t.next != last) {
                t = t.next;
            }
            System.out.println("Deleted: " + last.data);
            last = t;
            t.next = root;
        }
    }
    
    void print_list() {
        if (root == null) {
            System.out.println("Empty list.");
        } else {
            Node t = root;
            do {
            	System.out.print("|" + t.data + "|->");
            	t = t.next;
            }
            while (t != root);
            System.out.println("back to root");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Circular_Linked_List obj = new Circular_Linked_List();
        int choice, data;

        do {
            System.out.println("\n=====CIRCULAR LINKED LIST MENU =====");
            System.out.println("1. Insert Left");
            System.out.println("2. Insert Right");
            System.out.println("3. Delete Left");
            System.out.println("4. Delete Right");
            System.out.println("5. Display List");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    obj.insert_left(data);
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    obj.insert_right(data);
                    break;

                case 3:
                    obj.delete_left();
                    break;

                case 4:
                    obj.delete_right();
                    break;

                case 5:
                    obj.print_list();
                    break;

                case 0:
                    System.out.println("Exiting... Good bye 👋");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }		
}
