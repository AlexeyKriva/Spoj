import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[]{Integer.parseInt(Arrays.toString(br.readLine().split(" ")))};
            int sum = 0;
            for (int i: a){
                sum += i;
                if (sum > 3){
                    break;
                }
            }
            if (sum < 3){
                System.out.println("Tresi gagal memuaskan gadisnya.");
                continue;
            }
            int b = 0;
            int c = 0;
            for (int i = 0; i < n; i++){
                if (a[i] == 3){
                    b++;
                }
                if (a[i] == 4){
                    c++;
                }
            }
        }
    }
}