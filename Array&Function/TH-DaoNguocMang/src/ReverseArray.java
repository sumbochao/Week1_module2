import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        byte size;
        int[] array;

        Scanner scanner=new Scanner(System.in);

        do {
            System.out.print("Enter a size:");
            size = scanner.nextByte();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + " ");
        }

        for (int j = 0; j < size / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.printf("%-20s%s", "\nReverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }

}
