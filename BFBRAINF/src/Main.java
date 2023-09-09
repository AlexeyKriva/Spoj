import java.util.*;
import java.io.*;

public class Main {
    static char[] alf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            char[] str = br.readLine().toCharArray();
            int[] a = new int[str.length];
            int i = 0;
            StringBuilder output = new StringBuilder();
            for (char s : str) {
                switch (s) {
                    case '>':
                        i++;
                        break;
                    case '<':
                        i--;
                        break;
                    case '+':
                        a[i]++;
                        break;
                    case '-':
                        a[i]--;
                        break;
                    case '.':
                        output.append(alf[a[i]]);
                        break;
                }
            }
            System.out.println(output);
        }
    }
}
