import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] results = new long[1000000];
        int i;
        for (i = 0; ; i++) {
            results[i] = 0;
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            long sum = 0;
            int[] numbers = new int[n];
            for (int j = 0; j < n; j++) {
                numbers[j] = scanner.nextInt();
                sum += numbers[j];
            }
            if (sum % n == 0) {
                for (int j = 0; j < n; j++) {
                    if (sum / n > numbers[j]){
                        results[i] += sum / n - numbers[j];
                    }
                }
            } else {
                results[i] = -1;
            }
        }
        for (int j = 0; j < i; j++) {
            System.out.println(results[j]);
        }
    }
}
