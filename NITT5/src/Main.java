import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Считываем перевод строки после числа t

        for (int i = 0; i < t; i++) {
            StringBuilder numberString = new StringBuilder(scanner.next());
            long sum = 0;
            for (int j = 0; j < numberString.length(); j++){
                StringBuilder str = new StringBuilder(numberString.substring(j, j + 1));
                sum += Integer.parseInt(String.valueOf(str));
                for (int k = i + 1; k < numberString.length(); k++){
                    str.append(numberString.charAt(k));
                    sum += Integer.parseInt(String.valueOf(str));
                }
            }
            System.out.println(sum % 9);
        }
    }
}
