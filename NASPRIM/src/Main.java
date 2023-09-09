import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int k = scanner.nextInt();
        boolean[] isPrime = new boolean[r + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= r; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= r; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int res = 0;
        for (int i = l; i <= r - k; i++){
            if (isPrime[i] && isPrime[i + k]) {
                res++;
            }
        }
        System.out.println(res);
    }
}
