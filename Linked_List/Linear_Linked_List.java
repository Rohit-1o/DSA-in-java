package Linked_List;

import java.util.Scanner;

public class Linear_Linked_List {

	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
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
	            System.out.println("Empty list.");
	        } else {
	            Node t = root;
	            root = root.next;
	            System.out.println("Deleted: " + t.data);
	        }
	    }

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

	    void delete_right() {
	        if (root == null) {
	            System.out.println("Empty list.");
	        } else if (root.next == null) {
	            System.out.println("Deleted: " + root.data);
	            root = null;
	        } else {
	            Node t = root;
	            Node t2 = root;
	            while (t.next != null) {
	                t2 = t;
	                t = t.next;
	            }
	            t2.next = null;
	            System.out.println("Deleted: " + t.data);
	        }
	    }

	    void print_list() {
	        if (root == null) {
	            System.out.println("Empty list.");
	        } else {
	            Node t = root;
	            while (t != null) {
	                System.out.print("|" + t.data + "|->");
	                t = t.next;
	            }
	            System.out.println("NULL");
	        }
	    }

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
	    void insert_after(int ref,int new_data)
	//insert_after(20,30);
	    {
	        if (root == null) {
	            System.out.println("Empty list.");
	        }
	        else
	        {
	            Node t = root;//1
	            while (t != null) //2
	            {
	                if (t.data == ref)
	                {
	                    System.out.println(ref + " Found");
	                    Node n=new Node(new_data);
	                    n.next=t.next;//3
	                    t.next=n;//4
	                    System.out.print("\n"+new_data + " inserted");
	                    return;
	                }
	                t = t.next;
	            }
	            System.out.println(ref + " Not Found");
	        }
	    }
	    void delete_element(int data)//Data to be searched and if found, delete.
	//insert_after(20,30);
	    {
	        if (root == null) {
	            System.out.println("Empty list.");
	        }
	        else
	        {
	            Node t = root;//1
	            Node t2=root;//1
	            while (t != null) //2
	            {
	                if (t.data == data)
	                {
	                    System.out.println(data + " Found");
	                    if(t==root)//case 1
	                        root=root.next;
	                    else if(t.next==null)//case2
	                        t2.next=null;
	                    else//case3
	                        t2.next=t.next;
	                    System.out.print("\n"+t.data + " deleted");
	                    return;
	                }
	                t2=t;
	                t = t.next;
	            }
	            System.out.println("\n" +data+ " Not Found");
	        }
	    }


	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        Linear_Linked_List obj = new Linear_Linked_List();
	        int choice, data;

	        do {
	            System.out.println("\n===== LINKED LIST MENU =====");
	            System.out.println("1. Insert Left");
	            System.out.println("2. Insert Right");
	            System.out.println("3. Delete Left");
	            System.out.println("4. Delete Right");
	            System.out.println("5. Display List");
	            System.out.println("6. Search Element");
	            System.out.println("7. Insert After");
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

	                case 6:
	                    System.out.print("Enter element to search: ");
	                    data = sc.nextInt();
	                    obj.search_list(data);
	                    break;
	                    
	                case 7 :
	                	System.out.println("");
	                	

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


