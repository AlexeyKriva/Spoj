import java.util.Scanner;

class Node {
    int tsum;
    int lsum, rsum;
    int best;
}

public class Main {
    static int n, m, s[];
    static Node inf = new Node();
    static Node tree[];

    public static void build(int i, int l, int h) {
        if (l == h) {
            tree[i].tsum = tree[i].rsum = tree[i].lsum = tree[i].best = s[l];
            return;
        }
        int mid = (l + h) / 2;
        build(2 * i, l, mid);
        build(2 * i + 1, mid + 1, h);
        tree[i].tsum = tree[2 * i].tsum + tree[2 * i + 1].tsum;
        tree[i].lsum = Math.max(tree[2 * i].lsum, tree[2 * i].tsum + tree[2 * i + 1].lsum);
        tree[i].rsum = Math.max(tree[2 * i + 1].rsum, tree[2 * i + 1].tsum + tree[2 * i].rsum);
        tree[i].best = Math.max(Math.max(Math.max(tree[i].lsum, tree[i].rsum), Math.max(tree[2 * i].rsum + tree[2 * i + 1].lsum, tree[i].tsum)), Math.max(tree[2 * i].best, tree[2 * i + 1].best));
    }

    public static Node query(int in, int i, int j, int u, int v) {
        if (v < i || u > j) return inf;
        if (i <= u && j >= v) return tree[in];
        int mid = (u + v) / 2;
        Node a = query(2 * in, i, j, u, mid);
        Node b = query(2 * in + 1, i, j, mid + 1, v);
        Node temp = new Node();
        temp.tsum = a.tsum + b.tsum;
        temp.lsum = Math.max(a.lsum, a.tsum + b.lsum);
        temp.rsum = Math.max(b.rsum, b.tsum + a.rsum);
        temp.best = Math.max(Math.max(Math.max(temp.lsum, temp.rsum), Math.max(a.rsum + b.lsum, temp.tsum)), Math.max(a.best, b.best));
        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total1, total2, total3, total;

        inf.rsum = inf.lsum = inf.best = -1000000;
        inf.tsum = 0;

        int x1, y1, x2, y2, t;
        t = scanner.nextInt();
        while (t-- > 0) {
            n = scanner.nextInt();
            s = new int[n];
            tree = new Node[4 * n];
            for (int i = 0; i < n; i++) s[i] = scanner.nextInt();

            for (int i = 0; i < 4 * n; i++) tree[i] = new Node();

            build(1, 0, n - 1);
            m = scanner.nextInt();
            for (int i = 0; i < m; i++) {
                x1 = scanner.nextInt();
                y1 = scanner.nextInt();
                x2 = scanner.nextInt();
                y2 = scanner.nextInt();
                x1--;
                y1--;
                x2--;
                y2--;

                if (x2 > y1) {
                    total = query(1, y1 + 1, x2 - 1, 0, n - 1).tsum;
                    total += query(1, x1, y1, 0, n - 1).rsum;
                    total += query(1, x2, y2, 0, n - 1).lsum;
                } else {
                    total = query(1, x2, y1, 0, n - 1).best;
                    total = Math.max(total, Math.max((query(1, x1, x2 - 1, 0, n - 1).rsum) + (query(1, x2, y2, 0, n - 1).lsum),
                            (query(1, x1, y1, 0, n - 1).rsum) + (query(1, y1 + 1, y2, 0, n - 1).lsum)));
                }

                System.out.println(total);
            }
        }
    }
}
