import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++){
            System.out.print(i + " ");
        }
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] c = new int[n];
//        for (int i = 0; i < n; i++) {
//            c[i] = scanner.nextInt();
//        }
//        int t1 = 0, t2 = 0;
//        int[] a = new int[n * n * n];
//        int[] b = new int[n * n * n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                for (int k = 0; k < n; k++) {
//                    a[t1++] = c[i] * c[j] + c[k];
//                    if (c[k] != 0) {
//                        b[t2++] = (c[i] + c[j]) * c[k];
//                    }
//                }
//            }
//        }
//        int[] a1 = Arrays.copyOf(a, t1);
//        int[] b1 = Arrays.copyOf(b, t2);
//        Arrays.sort(a1, 0, t1);
//        Arrays.sort(b1, 0, t2);
//        int j = 0, count = 0, temp = 0;
//        for (int i = 0; i < t1; i++) {
//            if (i != 0 && a1[i] == a1[i - 1]) {
//                count += temp;
//            } else {
//                temp = 0;
//                while (j < t2 && b1[j] < a1[i]) {
//                    j++;
//                }
//                while (j < t2 && b1[j] == a1[i]) {
//                    temp++;
//                    j++;
//                }
//                count += temp;
//            }
//        }
//        System.out.println(count);
    }
}
