	package Linked_List;
	
	import java.util.Scanner;
	
		public class Dynamic_Queue {
		
			class Node {
				int data;
				Node next;
	
				Node(int data) {
					this.data = data;
					this.next = null;
				}
			}
	
		    Node front,rear;
		    void enqueue(int data) {
		        Node n = new Node(data);
		        if (rear == null)//no queue
		        {
		            front = rear = n;//Single node so front and rear both are at the exact location.
		        } else {
		            rear.next = n;//1
		            rear = n;//2
		        }
		    }
		    void dequeue()
		    {
		        if(front==null)
		            System.out.println("Queue Empty");
		        else
		        {
		            Node t=front;//build ref
		            if(front==rear)
		            {
		                front=rear=null;//Manual Reset.
		            }
		            else
		            {
		                front=front.next;//
		            }
		            System.out.println("\nDeleted:"+t.data);
		        }
		    }
		    void print_queue()
		    {
		        if(front==null)
		            System.out.print("\nEmpty Queue");
		        else
		        {
		            Node t=front;
		            while(t!=null)
		            {
		                System.out.print("|"+t.data+"|");
		                t=t.next;
		            }
	
		        }
		    }
		    
		    public static void main(String[] args) {
		        int size,e,choice;
		       
		        Dynamic_Queue obj=new Dynamic_Queue();
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter size of Queue:");
		        size=sc.nextInt();
		        do 
		        {
		            //Create menu:
		            System.out.println("Queue Menu ");
		            System.out.println("==============");
		        	System.out.println("1.Enqueue");//1. Push 
		        	System.out.println("2.Dequeue"); //2. Pop
		        	System.out.println("3.Print");//3. Print
		        	System.out.println("4.Exit");// 4. Exit
		        	
		            //read choice
		            choice=sc.nextInt();
		        	switch(choice)
		            {
		                case 1:
		            	        System.out.println("Enter Element");
		            	        e=sc.nextInt();
		            	        obj.enqueue(e);
		            	        break;            	         
		   
		                case 2:
		                	obj.dequeue();
		                	break;
		                	           	
		                case 3:
		                	obj.print_queue();
		                	break;
		                	                	
		                case 4://Exit message and stop. 
		                	System.out.println("Exit meassage..");
		                	break;
		                	
		                default://Invalid choice
		                	System.out.println("Invalid choice");
		            }
		        }while(choice!=0);
		    }
	}
