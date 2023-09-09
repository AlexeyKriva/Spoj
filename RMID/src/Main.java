import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream printStream = new PrintStream(System.out);
        boolean flag = true;
        LinkedList<Integer> a = new LinkedList<>();
        while (flag) {
            String line = "";
            try {
                line = reader.readLine();
                if (!line.equals("")) {
                    int b = Integer.parseInt(line);
                    if (b == 0) {
                        printStream.print("\n");
                    } else if (b == -1) {
                        if (a.size() % 2 == 0) {
                            printStream.print(a.remove(a.size() / 2 - 1) + "\n");
                        } else {
                            printStream.print(a.remove(a.size() / 2) + "\n");
                        }
                    } else {
                        a.add(b);
                    }
                } else {
                    a.clear();
                }
            } catch (Exception e) {
                flag = false;
            }
        }
    }
}
