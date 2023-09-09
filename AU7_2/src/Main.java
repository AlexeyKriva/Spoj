import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static class Server implements Comparable<Server> {
        int work;
        long endWork;
        Server (int id, int work){
            this.work = work;
            this.endWork = 0;
        }

        @Override
        public int compareTo(Server o){
            return Integer.compare(this.work, o.work);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0){
            int n = scanner.nextInt();
            long m = scanner.nextInt();
            Server[] power = new Server[n];
            for (int i = 0; i < n; i++){
                power[i] = new Server(i + 1, scanner.nextInt());
            }
            Arrays.sort(power);
            long tm = 0;
            Deque<Server> servers = new ArrayDeque<>();
            for (int i = 0; i < n; i++){
                servers.offer(power[i]);
            }
            for (int i = 0; i < m; i++){
                Server server = servers.pop();
                if(server.endWork + server.work < servers.getFirst().work + servers.getFirst().endWork){
                    server.endWork += server.work;
                    tm = server.endWork;
                    servers.addFirst(server);
                }
                else{
                    servers.addLast(server);
                    server = servers.pop();
                    server.endWork += server.work;
                    tm = server.endWork;
                    servers.addFirst(server);
                }
            }
            System.out.println(tm);
            t--;
        }
    }
}