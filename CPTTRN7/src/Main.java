import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0){
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            int s = scanner.nextInt();
            int left = s / 2;
            int right = s / 2 + 1;
            int mid = 0;
            for (int i = 0; i < 2 * r * s; i++){
                int le = 0;
                int ri = 0;
                for (int j = 0; j < 2 * c * s; j++){
                    if (mid < s){
                        if (left == le){
                            System.out.print('/');
                            le = -1 * right;
                        } else if (right == ri){
                            System.out.print('\\');
                            ri = -1;
                        } else {
                            System.out.print('.');
                        }
                    } else {
                        if (left == le){
                            System.out.print('\\');
                            le = -1 * right;
                        } else if (right == ri){
                            System.out.print('/');
                            ri = -1;
                        } else {
                            System.out.print('.');
                        }
                    }
                    le++;
                    ri++;
                }
                mid++;
                if (mid < s){
                    left--;
                    right++;
                } else if (mid > s){
                    left++;
                    right--;
                }
                if (mid == 2 * s){
                    mid = 0;
                }
                System.out.println();
            }
            System.out.println();
            t--;
        }
    }
}