package Queue_Examples;

import java.util.Scanner;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Priority_Queue {

	 private int front,rear,MaxSize,queue[];
	   //create stack:Ask user for size and create a stack of that size.
	    void create_queue(int size)
	    {
	        rear=-1;
	        front=0;
	        MaxSize=size;
	        queue=new int[MaxSize];
	    }
	   //enqueue(e):
	    //Inserts an element on top of the stack.
	    //In every push, the tos increments by one and
	    // then we insert the element.
	    public void enqueue(int e)
	    {
	        queue[++rear]=e;
	        //sort
	        for(int i=front;front<rear;i++)
	        {
	        	for (int j=front;front<rear;i++)
	        	{
	        		if(queue[j]>queue[j+1])
	        		{
	        			int temp = queue[j];
	        			queue[j] = queue[j+1];
	        			queue[j+1]=temp;
	        		}
	        	}
	        }
	    }
	    //is_full()
	    // which returns true if Queue is full and false if Queue is not full
	    boolean is_full()
	    {
	        return (rear==MaxSize-1);
	    }
	    //dequeue():e Removes and returns the element at queue front element.
	    //With every dequeue front++
	    int dequeue()
	    {
	        return (queue[front++]);
	    }
	    //empty
	    boolean is_empty()
	    {
	       return (front>rear);
	    }
	    void print_queue()//Print Queue in FIFO manner.
	    {
	        for(int i=front;i<=rear;i++)
	        {
	            System.out.print(queue[i]+"-");
	        }
	    }

	public static void main(String[] args) {
        int size,e,choice;
        Queue_Class obj=new Queue_Class();

        Scanner sc=new Scanner(System.in);
        //only at start
        System.out.println("Enter size of Queue:");
        size=sc.nextInt();
        //create Queue and init
        obj.create_queue(size);
        do 
        {
            //Create menu:
            System.out.println("Queue Menu ");
            System.out.println("==============");
        	System.out.println("1.Push");//1. Push 
        	System.out.println("2.Dequeue"); //2. Pop
        	System.out.println("3.Print");//3. Print
        	System.out.println("4.Exit");// 4. Exit
        	
            //read choice
            choice=sc.nextInt();
        	switch(choice)
            {
                case 1://Check if Queue is not full; then only enqueue; else show message. 
            	        if(!obj.is_full()) {
            	        	System.out.println("Enter element");
            	        	e = sc.nextInt();
            	        	obj.enqueue(e);
            	        	System.out.println("Element Pushed");
            	        } else {
            	        	System.out.println("Queue is full");
            	        }
            	        break;            	         
   
                case 2://Check if Queue is not empty; then only dequeue; else show message. 
                	if(!obj.is_empty()) {
                		System.out.println("Element Pop " + obj.dequeue());
                	} else {
                		System.out.println("Queue is empty");
                	}
                	break;
                	
             
                	
                case 3://Check if Queue is not empty; then only print; else show message.
                	if(!obj.is_empty()) {
                		System.out.println("Queue elements");
                		obj.print_queue();
                	} else {
                		System.out.println("Queue is empty");
                	}
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
