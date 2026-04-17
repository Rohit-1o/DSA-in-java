//collection based queue
package Queue_Examples;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Collection_Based
{
    public static void main(String[] args) {
        int size, e, choice;

        Queue<Integer> obj=new LinkedList<>();//
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nQueue Menu");
            System.out.print("\n==========");
            System.out.print("\n1.Enqueue");
            System.out.print("\n2.Dequeue");
            System.out.print("\n3.Print");
            System.out.print("\n0.Exit");
            System.out.print("\n:");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                        System.out.print("\nEnter Data:");
                        e = sc.nextInt();
                        obj.offer(e);
                        System.out.print("\n" + e + " Enqueued");
                        break;

                case 2:
                    if (!obj.isEmpty()) {
                        System.out.print("\n" +obj.poll() + " Dequeued");
                    } else
                    {
                        System.out.print("\nQueue Empty");
                    }
                    break;

                case 3:
                    if (!obj.isEmpty()) {
                        System.out.print("\nQueue has:\n");
                        System.out.println(obj);
                    } else {
                        System.out.print("\nQueue Empty");
                    }
                    break;

                case 0:
                    System.out.print("\nExiting code......");
                    break;

                default:
                    System.out.print("\nInvalid choice");
                    break;
            }

        } while (choice != 0);
    }
}



