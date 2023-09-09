import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long n = scanner.nextLong();
            long m = n;
            n = n - 2;

            if (n % 2 == 0) {
                n--;
            }

            n = n / 2 + 1;
            n = n * n;

            if (n >= m) {
                long x = n / m;
                x = x * m;
                n = n - x;
            }

            System.out.println(n);
        }
    }
}
