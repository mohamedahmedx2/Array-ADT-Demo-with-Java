import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create an array and set its size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        Array myArray = new Array(size);

        // Step 2: Fill the array with initial values
        myArray.fill();

        // Step 3: Search for an item in the array
        System.out.println("Enter the value to search: ");
        int searchKey = scanner.nextInt();
        int foundIndex = myArray.search(searchKey);
        if (foundIndex != -1) {
            System.out.println("Item found at index: " + foundIndex);
        } else {
            System.out.println("Item not found in the array.");
        }

        // Step 4: Append a new item to the array
        System.out.println("Enter a new item to append: ");
        int newItem = scanner.nextInt();
        myArray.append(newItem);

        // Step 5: Insert a new item at a specific index
        System.out.println("Enter the index to insert the new item: ");
        int insertIndex = scanner.nextInt();
        System.out.println("Enter the value to insert: ");
        int insertItem = scanner.nextInt();
        myArray.insert(insertIndex, insertItem);

        // Display final array
        System.out.println("Final array:");
        myArray.display();

    }


}
