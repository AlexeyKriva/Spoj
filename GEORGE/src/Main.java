import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();;
        int m = scanner.nextInt();;
        int a = scanner.nextInt() - 1;
        int b = scanner.nextInt() - 1;
        int k = scanner.nextInt();
        int g = scanner.nextInt();
        int[][] tmGeorge = new int[n][n];
        int[][] tmLuka = new int[n][n];
        int[] georgePath = new int[g];
        int[] paths = new int[n];
        int[] visited = new int[n];
        int bigNumber = 1000000000;
        for (int i = 0; i < n; i++) {
            Arrays.fill(tmLuka[i], bigNumber);
            Arrays.fill(tmGeorge[i], bigNumber);
        }
        for (int i = 0; i < g; i++) {
            georgePath[i] = scanner.nextInt() - 1;
        }
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            int t = scanner.nextInt();
            tmLuka[x][y] = tmLuka[y][x] = t;
        }

        int temp = 0;
        for (int i = 1; i < g; i++) {
            tmGeorge[georgePath[i - 1]][georgePath[i]] = temp;
            tmGeorge[georgePath[i]][georgePath[i - 1]] = temp;
            temp = temp + tmLuka[georgePath[i - 1]][georgePath[i]];
        }
        Arrays.fill(paths, bigNumber);
        Arrays.fill(visited, 0);
        paths[a] = k;
        for (int i = 0; i < n; i++) {
            int check = -1;
            for (int j = 0; j < n; j++) {
                if (visited[j] == 1)
                    continue;
                if (check == -1 || paths[j] < paths[check])
                    check = j;
            }
            visited[check] = 1;
            for (int j = 0; j < n; j++) {
                if (paths[check] < tmGeorge[check][j])
                    paths[j] = Math.min(tmLuka[check][j] + paths[check], paths[j]);
                else
                    paths[j] = Math.min(paths[j], Math.max(tmGeorge[check][j] + tmLuka[check][j], paths[check]) + tmLuka[check][j]);
            }
        }
        System.out.println(paths[b] - paths[a]);
    }
}
