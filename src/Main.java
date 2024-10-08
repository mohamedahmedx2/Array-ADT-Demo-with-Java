import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter The Array Size:");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        Array myArray = new Array(arraySize);
        myArray.fill();
      //  myArray.display();
        System.out.println("Array Size: "+myArray.getSize());
        System.out.println("Array length: "+myArray.getLength());
        System.out.println("Enter the value to search for");
        int key = scanner.nextInt();
       int index = myArray.search(key);
       if (index == -1)
       {
           System.out.println("item not found");
       } else {
           System.out.println("item found @ position: " + index);
       }
    }


}
