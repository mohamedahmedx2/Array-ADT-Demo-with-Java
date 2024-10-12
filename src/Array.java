import java.util.Scanner;



public class Array {
    private int size;
    private int[] items;
    private int length;

    Array(int arraySize) {
        size = arraySize;
        length = 0;
        items = new int[arraySize];
    }

    // Fill the array
    void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Items You Want To Fill?");
        int numberOfItem = scanner.nextInt();
        if (numberOfItem > size) {
            System.out.println("You Cannot Exceed The Array Size");
        } else {
            for (int i = 0; i < numberOfItem; i++) {
                System.out.println("Enter item number " + (i + 1) + ":");
                int newItem = scanner.nextInt();
                items[i] = newItem;
                length++;
            }
            display();
        }
    }

    // Display the values in the array
    void display() {
        System.out.println("Array Items:");
        for (int i = 0; i < length; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    // Get the total size of the array
    int getSize() {
        return size;
    }

    // Get the actual number of elements in the array
    int getLength() {
        return length;
    }

    // Search for an element in the array by key
    int search(int key) {
        for (int i = 0; i < length; i++) {
            if (items[i] == key) {
                return i;  // Return index if found
            }
        }
        return -1;  // Return -1 if not found
    }

    // Append a new item at the end of the array
    void append(int newItem) {
        if (length < size) {
            items[length] = newItem;
            length++;
            display();
        } else {
            System.out.println("Error: array is full.");
        }
    }

    // Insert an item at a specific index
    void insert(int index, int newItem) {
        if (index >= 0 && index <= length && length < size) {
            for (int i = length; i > index; i--) {
                items[i] = items[i - 1];
            }
            items[index] = newItem;
            length++;
            display();
        } else if (length >= size) {
            System.out.println("Error: array is full, cannot insert new item.");
        } else {
            System.out.println("Error: index out of range.");
        }
    }


    // delete an item at a specific index
    void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < length - 1; i++) {
                items[i] = items[i + 1];

            }
            length--;
            System.out.println("Element deleted successfully.");
        } else {
            System.out.println("index out of array rang");
        }
    }

}
