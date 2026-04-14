package Stack_Example;
import java.util.Scanner;
import java.util.Stack;
public class Stack_Collection_Based {

	public static void main(String[] args) {
        int e,choice;
        Stack<Integer> stack = new Stack<>();
        Scanner sc=new Scanner(System.in);
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
            	        	System.out.println("Enter element");
            	        	e = sc.nextInt();
            	        	stack.push(e);
            	        	System.out.println( e + "Element Pushed");
            	        break;
            	            
                case 2://Check if stack is not empty; then only pop; else show message. 
                	if(!stack.empty()) {
                		System.out.println("Element Pop " + stack.pop());
                	} else {
                		System.out.println("Stack is empty");
                	}
                	break;
                	
                case 3://Check if stack is not empty; then only peek; else show message.
                	if(!stack.empty()) {
                		System.out.println("Element peek " + stack.peek());
                	} else {
                		System.out.println("Stack is empty");
                	}
                	break;
                	
                case 4://Check if stack is not empty; then only print; else show message.
                	if(!stack.empty()) {
                		System.out.println("Stack elements");
                		 for(int i=stack.size()-1;i>=0;i--)
                             System.out.print("\n"+stack.get(i));
                     }
                     else
                         System.out.print("Stack Empty");

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
