package Stack_Example;

import java.util.Scanner;
import java.util.Stack;

public class Reversed_String {
    //Create a method reverse
    // which will accept the string and return the reverse string
    // using a stack inside itself.
    static String reverse(String word)
    {
        Stack<Character> stack=new Stack<>();
        for(char c:word.toCharArray())
        {
            stack.push(c);
        }
        String reverse_word="";
        while(!stack.empty())
        {
            reverse_word=reverse_word+stack.pop();
        }
        return reverse_word;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=sc.next();
        String reverse_word=reverse(word);
        System.out.print("\nReverse word is :"+reverse_word);
    }
}


