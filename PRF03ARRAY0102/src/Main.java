import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextLong();
        }
        Arrays.sort(array);
        System.out.print("How many element of numeric array:");
        for (int i = 0; i < n; i++){
            System.out.print("The value of a[" + (i + 1) + "] is:");
        }
        System.out.println("\n\n" + "ASC:\n" + n + " element of numeric array:");
        for (int i = 0; i < n; i++){
            System.out.println("The value of a[" + (i + 1) + "] is:" + array[i]);
        }
    }
}