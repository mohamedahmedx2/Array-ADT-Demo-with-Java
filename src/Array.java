import java.util.Scanner;

public class Array {
    private int size;
    private int[] item;
    private int length;

    Array(int arraySize) {

        size = arraySize;
        length = 0;
        item = new int[arraySize];

    }

    void fill() {

        System.out.println("How Many Items You Want To Fill?");
        Scanner scanner = new Scanner(System.in);
        int numberOfItem = scanner.nextInt();
        if (numberOfItem > size) {
            System.out.println("You Cannot Exceed The Array Size");

        } else {
            for (int i = 0; i < numberOfItem; i++) {
                System.out.println("Enter Item Number " + (i + 1) + ":");
                int newItem = scanner.nextInt();
                item[i] = newItem;
                length++;
            }
            display();
        }


    }

    void display() {
        System.out.println("Display Array Items");
        for (int i = 0; i < length; i++) {
            System.out.println(item[i]);
        }
    }

    int getSize() {
        return size;
    }

    int getLength() {
        return length;
    }


}
