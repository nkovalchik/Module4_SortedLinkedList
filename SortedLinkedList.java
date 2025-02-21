import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * This program asks the user for a list of integers sperated by a space that
 * then get input to the program using the scanner.  The values are then
 * stores in a LinkedList.  The linked list is then sorted in ascending order.
 */
public class SortedLinkedList {

    /**
     * Reads a list of integers from user input, stores them in a LinkedList,
     * sorts them in ascending order, and prints the sorted list. Instead of 
     * creating sorting logic in main where it could not be used I created a method in class for reusability.
     * Now whenever you want to sort numbers inputed by a user you can just call function.
     * <p>
     * The method:
     * 1. Prompts the user to enter space separated integers.
     * 2. Reads and converts the input into integers stored in a LinkedList.
     * 3. Sorts the LinkedList using {@code Collections.sort()}.
     * 4. Prints the sorted list.
     * </p>
     * 
     */

    public static void sortALinkedList(){
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Create a LinkedList to store integers. Used LinkedList framework so its built in functions
        // can be called and reused as needed
        List<Integer> numbers = new LinkedList<>();
        
        System.out.println("Enter integers (separated by space), then press Enter:");
        
        // Read user input as a line and split based on a space into an array of strings where each element in a number 
        String[] input = scanner.nextLine().split(" ");
        
        // Convert each input charcter to an integer and add it to the list
        for (String num : input) {
                numbers.add(Integer.parseInt(num));
        }
        
        // Close the scanner to prevent unexpected values from being inputted 
        scanner.close();
        
        // Use collections to sort the LinkedList in ascending order.  Used reusable collection functions to sort the linkedList of numbers
        Collections.sort(numbers);
        
        // Display the sorted linked list
        System.out.println("Sorted List:");
        System.out.println(numbers);
    }

     /**
     * The main method executes the sorting function.
     * 
     */

    public static void main(String[] args) {
    sortALinkedList();
    
    }    
}
//java SortedLinkedList.java
//javadoc -d doc SortedLinkedList.java