import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String[] line1;
        String[] line2;
        String[] line3;
        try {
            n = Integer.parseInt(bufferedReader.readLine());
            line1 = bufferedReader.readLine().split(" ");
            line2 = bufferedReader.readLine().split(" ");
            line3 = bufferedReader.readLine().split(" ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < n; i++){

        }
    }
}