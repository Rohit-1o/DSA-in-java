package Stack_Example;

import java.util.Scanner;
import java.util.Stack;

public class StackBrackets {
	static boolean check(String pattern)
	{
		Stack<Character> stack =new Stack<>();
	    for(char c: pattern.toCharArray())
	    {
	    	if(c=='{')
	    		stack.push(c);
	        else if(c=='}')
	        {
	        	if(stack.empty())
	        		return false;
	            else
	                stack.pop();
	        }
	    }
	    return (stack.empty());
	}
	    
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter pattern to check:");
	    String data=sc.next();
	    System.out.println("Given patter is:"+check(data));
	}	
}
