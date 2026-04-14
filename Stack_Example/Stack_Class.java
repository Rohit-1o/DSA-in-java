package Stack_Example;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Stack_Class {
	
	 private int tos,MaxSize,stack[];
	   //create stack:Ask user for size and create a stack of that size.
	    void create_stack(int size)
	    {
	        tos=-1;
	        MaxSize=size;
	        stack=new int[MaxSize];
	    }
	   //push(e):
	    //Inserts an element on top of the stack.
	    //In every push, the tos increments by one and
	    // then we insert the element.
	    public void push(int e)
	    {
	        tos++;
	        stack[tos]=e;
	        //stack[++tos]=e;
	    }
	    //is_full()
	    // which returns true if stack is full and false if stack is not full
	    boolean is_full()
	    {
	        if(tos==MaxSize-1)
	            return true;
	        else
	            return false;
	        //return (tos==MaxSize-1);
	    }
	    //pop():e Removes and returns the topmost element.
	    //With every pop, tos decrements by one.
	    int pop()
	    {
	        int temp=stack[tos];
	        tos--;
	        return temp;
	        //return (stack[tos--]);
	    }
	    boolean is_empty()
	    {
	        if(tos==-1)
	            return true;
	        else
	            return false;
	        //return (tos==-1);
	    }
	    //peek:Only returns the topmost element.
	    int peek()
	    {
	        return (stack[tos]);
	    }
	    void print_stack()//Print stack in LIFO manner.
	    {
	        for(int i=tos;i>-1;i--)
	        {
	            System.out.println(stack[i]);
	        }
	    }

	public static void main(String[] args) {
        int size,e = 0,choice;
        Stack_Class obj=new Stack_Class();

        Scanner sc=new Scanner(System.in);
        //only at start
        System.out.println("Enter size of stack:");
        size=sc.nextInt();
        //create stack and init
        obj.create_stack(size);
        do 
        {
            //Create menu:
            System.out.println("Stack Menu ");
            System.out.println("==============");
        	System.out.println("1.push");//1. Push 
        	System.out.println("2.pop"); //2. Pop
        	System.out.println("3.peek");  //3. Peek
        	System.out.println("4.print");//4. Print
        	
        	
            //read choice
            choice=sc.nextInt();
        	switch(choice)
            {
                case 1://Check if stack is not full; then only push; else show message. 
            	        if(!obj.is_full()) {
            	        	System.out.println("Enter element");
            	        	e = sc.nextInt();
            	        	obj.push(e);
            	        	System.out.println("Element Pushed");
            	        } else {
            	        	System.out.println("Stack is full");
            	        }
            	        break;
            	         
   
                case 2://Check if stack is not empty; then only pop; else show message. 
                	if(!obj.is_empty()) {
                		System.out.println("Element Pop " + obj.pop());
                	} else {
                		System.out.println("Stack is empty");
                	}
                	break;
                	
                	
                case 3://Check if stack is not empty; then only peek; else show message.
                	if(!obj.is_empty()) {
                		System.out.println("Element peek " + obj.peek());
                	} else {
                		System.out.println("Stack is empty");
                	}
                	break;
                	
                case 4://Check if stack is not empty; then only print; else show message.
                	if(!obj.is_empty()) {
                		System.out.println("Stack elements");
                		obj.print_stack();
                	} else {
                		System.out.println("Stack is empty");
                	}
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




