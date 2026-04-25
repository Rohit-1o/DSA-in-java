package Linked_List;
import java.util.Scanner;
import Stack_Example.Stack_Class;

public class Dynamic_Stack {
	
	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	
	private Node tos;
	
	void push(int data) {
        Node n = new Node(data);
        if (tos == null) {
            tos = n;
        } else {
            n.next = tos;
            tos = n;
        }
    }

    void pop() {
        if (tos == null) {
            System.out.println("Empty Stack.");
        } else {
            Node t = tos;
            tos = tos.next;
            System.out.println("Poped: " + t.data);
        }
    }
	
    int peek() {
    	if (tos == null) {
            System.out.println("Empty Stack.");
            return -1;
        } else {
        	return tos.data;
        }
    }
    
    void print_list() {
        if (tos == null) {
            System.out.println("Empty Stack.");
        } else {
            Node t = tos;
            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
        }
    }
    
    public static void main(String[] args) {
        
    	int e = 0,choice;

        Scanner sc=new Scanner(System.in);
        Dynamic_Stack obj = new Dynamic_Stack();
        
        do 
        {
            //Create menu:
            System.out.println("Stack Menu ");
            System.out.println("==============");
        	System.out.println("1.push");//1. Push 
        	System.out.println("2.pop"); //2. Pop
        	System.out.println("3.peek");  //3. Peek
        	System.out.println("4.print");//4. Print
        	System.out.println("0. Exit");
        	 	
            //read choice
            choice=sc.nextInt();
        	switch(choice)
            {
                case 1:
                	System.out.print("Enter element: ");
                    e = sc.nextInt();
                    obj.push(e);
                    break;
            	         
   
                case 2:
                	obj.pop();
                	break;
                	
                case 3:
                	obj.peek();
                	break;
                	
                case 4:
                	obj.print_list();
                	break;
                	
                case 0://Exit message and stop. 
                	System.out.println("Exit meassage..");
                	break;
                	
                default://Invalid choice
                	System.out.println("Invalid choice");
            }
            
        }while(choice!=0);
    }
}
