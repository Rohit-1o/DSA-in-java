package Queue_Examples;

import java.util.Scanner;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Circular_Queue {

	 private int count,front,rear,MaxSize,cirqueue[];
	    void create_cirqueue(int size)
	    {
	        rear=-1;
	        front=0;
	        count=0;
	        MaxSize=size;
	        cirqueue=new int[MaxSize];
	    }

	    public void enqueue(int e)
	    {
	        rear = (rear+1)%MaxSize;
	        cirqueue[rear]=e;
	        count++;
	    }
	    //is_full()
	    boolean is_full()
	    {
	        return (count==MaxSize);
	    }
	    //dequeue():e Removes and returns the element at queue front element.
	    //With every dequeue front++
	    int dequeue()
	    {
	        int temp = (cirqueue[front]);
	        front = (front+1)%MaxSize;
	        count--;
	        return temp;
	    }
	    //empty
	    boolean is_empty()
	    {
	       return (count==0);
	    }
	    void print_queue()//Print Queue in FIFO manner.
	    {
	       int c=0;
	       int index=front;
	       while(c<count) 
	       {
	    	   System.out.print(cirqueue[index]+"-");
	    	   c++;
	    	   index=(index+1)%MaxSize;
	       }
	    }

	public static void main(String[] args) {
        int size,e,choice;
        Circular_Queue obj=new Circular_Queue();

        Scanner sc=new Scanner(System.in);
        //only at start
        System.out.println("Enter size of Circula Queue:");
        size=sc.nextInt();
        //create Queue and init
        obj.create_cirqueue(size);
        do 
        {
            //Create menu:
            System.out.println("Circular Queue Menu ");
            System.out.println("==============");
        	System.out.println("1.Enqueue");//1. Push 
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
            	        	System.out.println("Circular Queue is full");
            	        }
            	        break;            	         
   
                case 2://Check if Queue is not empty; then only dequeue; else show message. 
                	if(!obj.is_empty()) {
                		System.out.println("Element Pop " + obj.dequeue());
                	} else {
                		System.out.println("Circular Queue is empty");
                	}
                	break;
                	
             
                	
                case 3://Check if Queue is not empty; then only print; else show message.
                	if(!obj.is_empty()) {
                		System.out.println("Circular Queue elements");
                		obj.print_queue();
                	} else {
                		System.out.println("Circular Queue is empty");
                	}
                	break;
                	
                	
                case 4://Exit message and stop. 
                	System.out.println("Exit meassage..");
                	break;
                	
                default://Invalid choice
                	System.out.println("Invalid choice");
            }
        }while(choice!=4);
    }

}
