import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer>[] g = new ArrayList[10];
    public static void dfs(int vertex, boolean[] visited) {
        visited[vertex] = true;
        for (int neighbor : g[vertex]) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < 10; i++){
            g[i] = new ArrayList<>();
            if (i == 0 || i == 6){
                g[i].add(i + 1);
                g[i].add(3);
                if (i == 6)
                    g[i].add(9);
            } else if (i == 2 || i == 8){
                g[i].add(i - 1);
                g[i].add(6);
            } else if (i == 1 || i == 7){
                g[i].add(i + 1);
                g[i].add(i - 1);
                g[i].add(4);
            } else if (i == 3 || i == 5){
                g[i].add(i - 3);
                g[i].add(i + 3);
                g[i].add(4);
            } else if (i == 4){
                g[i].add(1);
                g[i].add(3);
                g[i].add(5);
                g[i].add(7);
            } else {
                g[i].add(6);
            }
        }
        g[1].add(2);
        while (t-- > 0){
            int n = scanner.nextInt();
            long result;
            boolean[] visited = new boolean[11];
        }
    }
}