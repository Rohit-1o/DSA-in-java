package Stack_Example;
import java.util.Scanner;
import java.util.Stack;

public class StackDecimaltoBinary {
	
	    //Create a method reverse
	    // which will accept the string and return the reverse string
	    // using a stack inside itself.
	    static Integer convert(Integer number)
	    {
	        Stack<Integer> stack=new Stack<>();
	        while(number>0)
	        {
	            if(number%2==0)
	                stack.push(0);
	            else
	                stack.push(1);
	            number=number/2;
	        }
	       Integer binary=0;
	        while(!stack.empty())
	        {
	            binary=binary*10+stack.pop();
	        }
	        return binary;
	    }
	    public static void main(String[] args) {

	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a number:");
	        Integer number=sc.nextInt();
	        Integer Binary_number=convert(number);
	        System.out.print("\nBinary number is :"+Binary_number);
	   }
}
