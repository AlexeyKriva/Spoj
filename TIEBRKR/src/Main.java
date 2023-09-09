import java.util.*;

public class Main {
    static class Point implements Comparable<Point> {
        double dist;
        int id;

        public Point(double first, int second) {
            this.dist = first;
            this.id = second;
        }

        @Override
        public int compareTo(Point other) {
            if (this.dist < other.dist)
                return -1;
            else if (this.dist > other.dist)
                return 1;
            else
                return 0;
        }
    }

    static double evklidDist(int x1, int y1, int x2, int y2) {
        return Math.sqrt(1.0 * (x1 - x2) * (x1 - x2) + 1.0 * (y1 - y2) * (y1 - y2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ax = scanner.nextInt();
        int ay = scanner.nextInt();
        int bx = scanner.nextInt();
        int by = scanner.nextInt();
        int tx = scanner.nextInt();
        int ty = scanner.nextInt();
        int n = scanner.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];
        Point[] distAdil = new Point[n];
        Point[] distBera = new Point[n];
        Point[] distUrn = new Point[n];

        double result = 0;
        double addDist = 0;

        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
            double dis = evklidDist(x[i], y[i], tx, ty);
            distAdil[i] = new Point(evklidDist(ax, ay, x[i], y[i]) - dis, i);
            distBera[i] = new Point(evklidDist(bx, by, x[i], y[i]) - dis, i);
            distUrn[i] = new Point(dis * 2, i);
            result += distUrn[i].dist;
        }

        Arrays.sort(distAdil, 0, n);
        Arrays.sort(distBera, 0, n);

        addDist = Math.min(distAdil[0].dist, distBera[0].dist);
        if (distAdil[0].id == distBera[0].id) {
            addDist = Math.min(addDist, Math.min(distAdil[0].dist + distBera[1].dist, distAdil[1].dist + distBera[0].dist));
        }
        else {
            addDist = Math.min(addDist, distAdil[0].dist + distBera[0].dist);
        }
        System.out.println(result + addDist);
    }
}
