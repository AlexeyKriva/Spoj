import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        while (amount != 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0 || a == 10 || a == 20) {
                System.out.println("0");
            } else if (a == 1 || a == 11) {
                System.out.println("1");
            } else if (a == 5 || a == 15) {
                System.out.println("5");
            } else if (a == 6 || a == 16) {
                System.out.println("6");
            }
            else {
                int[] list = new int[4];
                int i = 1;
                while (true) {
                    int num = 1;
                    for(int j = 0; j < i; j++){
                        num *= a;
                    }
                    String s = "" + num;
                    char c = s.charAt(s.length() - 1);
                    num = Character.digit(c, 10);
                    boolean key = true;
                    for (int j = 0; j < 4; j++){
                        if (list[j] == num){
                            key = false;
                        }
                    }
                    if (key)
                        list[i - 1] = num;
                    else
                        break;
                    i++;
                }
                if(list.length == 2){
                    if (b % 2 == 0) {
                        System.out.println(list[(int) (b % list.length) + 1]);
                    }
                    else {
                        System.out.println(list[(int) (b % list.length) - 1]);
                    }
                }
                else{
                    int index = (int) (b % list.length - 1);
                    System.out.println(index);
                    System.out.println(list[index]);
                }
            }
            amount--;
        }
    }
}