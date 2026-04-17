package Linked_List;

import java.util.Scanner;

public class Students {
	
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       Students<Integer> list = new Students<>();

       int choice, data, index;

       do {
           System.out.println("\n===== LINKED LIST MENU =====");
           System.out.println("1. Insert First");
           System.out.println("2. Insert Last");
           System.out.println("3. Insert at Position");
           System.out.println("4. Delete First");
           System.out.println("5. Delete Last");
           System.out.println("6. Delete by Value");
           System.out.println("7. Search");
           System.out.println("8. Display");
           System.out.println("0. Exit");
           System.out.print("Enter choice: ");

           choice = sc.nextInt();

           switch (choice) {
               case 1:
                   System.out.print("Enter data: ");
                   list.addFirst(sc.nextInt());
                   break;

               case 2:
                   System.out.print("Enter data: ");
                   list.addLast(sc.nextInt());
                   break;

               case 3:
                   System.out.print("Enter index: ");
                   index = sc.nextInt();
                   System.out.print("Enter data: ");
                   data = sc.nextInt();
                   list.add(index, data);
                   break;

               case 4:
                   if (!list.isEmpty())
                       list.removeFirst();
                   break;

               case 5:
                   if (!list.isEmpty())
                       list.removeLast();
                   break;

               case 6:
                   System.out.print("Enter value: ");
                   list.remove(Integer.valueOf(sc.nextInt()));
                   break;

               case 7:
                   System.out.print("Enter value: ");
                   data = sc.nextInt();
                   System.out.println(list.contains(data) ? "Found" : "Not Found");
                   break;

               case 8:
                   System.out.println("List: " + list);
                   break;

               case 0:
                   System.out.println("Exit successful 👋");
                   break;

               default:
                   System.out.println("Invalid choice");
           }

       } while (choice != 0);

       sc.close();
   }
}


