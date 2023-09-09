import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            float sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            sum = sum / n;
            System.out.println(String.format("%.6f", sum));
        }
    }
}
