import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long m = scanner.nextLong();

        long[] value = new long[n + 1];
        value[0] = 0;
        for (int i = 1; i <= n; i++) {
            long a = scanner.nextLong();
            value[i] = value[i - 1] + a;
        }

        long result = 0;
        for (int i = 1; i <= n; i++) {
            long need = m + value[i - 1];
            int index = binSearch(value, need) - 1;
            result = Math.max(result, value[index] - value[i - 1]);
        }

        System.out.println(result);
    }

    private static int binSearch(long[] value, long key) {
        int left = 0;
        int right = value.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (value[middle] <= key) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }
}
