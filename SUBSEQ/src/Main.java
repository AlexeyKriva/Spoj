import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t-- > 0){
            bufferedReader.readLine();
            int n = Integer.parseInt(bufferedReader.readLine());
            int[] arr = new int[n];
            int sum = 0;
            int[] a = Integer.parseInt(bufferedReader.readLine().split(" "));
            for (int i = 0; i < n; i++){
                for (int j = 0; j <= i; j++){;
                    arr[j] += Integer.parseInt(a[i]);
                    if (arr[j] == 47){
                        sum++;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}