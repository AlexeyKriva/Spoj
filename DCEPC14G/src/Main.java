import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0){
            int n = scanner.nextInt();
            boolean key = true;
            int[] a = {0, 4};
            int[] b = {1, 1};
            for (int i = 0; i < n; i++){
                if (i != 0 && a[i - 1] != 0){
                    if (key){
                        key = false;
                    }
                    else {
                        key = true;
                    }
                }
                if ((a[i] % 2 == 0 && b[i] == 1) || a[i] == 0){
                    if (key){
                        key = false;
                    }
                    else {
                        key = true;
                    }
                }
            }
            if (key) {
                System.out.println("Amit");
            }
            else {
                System.out.println("Mishra");
            }
            t--;
        }
    }
}