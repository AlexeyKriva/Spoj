import java.util.*;

public class Main {
    public static final float PI = 3.1415926535f;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(true){
            float l = scanner.nextFloat();
            if (l == 0){
                break;
            }
            System.out.println(String.format("%.2f", l*l/(2*PI)));
        }
    }
}