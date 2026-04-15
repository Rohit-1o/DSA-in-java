package Queue_Examples;

import java.util.LinkedList;
import java.util.Queue;

public class Bin_to_Dec
{
   public static void main(String[] args) {
       Queue<Character> queue = new LinkedList<>();
       String binary = "1101";
       for (char bit : binary.toCharArray()) {
    	   queue.add(bit);
       }
           int decimal = 0;
           while(!queue.isEmpty()) {
        	   int bit1 = queue.poll() - '0';
        	   decimal = decimal * 2 + bit1;
           }
       System.out.println("Sum is:"+decimal);
   }
}

