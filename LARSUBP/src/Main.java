import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;
    static final int[] TREE = new int[50];

    static void updateTree(int pos, int currentLeft, int currentRight, int newLeft, int newRight, int val) {
        if (currentLeft > currentRight || currentLeft > newRight || currentRight < newLeft) return;
        if (currentLeft >= newLeft && currentRight <= newRight) {
            TREE[pos] = (TREE[pos] + val) % MOD;
            return;
        }
        int middle = (currentLeft + currentRight) / 2;
        int leftDes = pos * 2;
        int rightDes = leftDes + 1;
        updateTree(leftDes, currentLeft, middle, newLeft, newRight, val);
        updateTree(rightDes, middle + 1, currentRight, newLeft, newRight, val);
        TREE[pos] = (TREE[leftDes] + TREE[rightDes]) % MOD;
    }

    static int sumSegment(int pos, int currentLeft, int currentRight, int newLeft, int newRight) {
        if (currentLeft > currentRight || currentLeft > newRight || currentRight < newLeft) return 0;
        if (currentLeft >= newLeft && currentRight <= newRight) return TREE[pos];
        int middle = (currentLeft + currentRight) / 2;
        int leftDes = pos * 2;
        int rightDes = leftDes + 1;
        int r1 = sumSegment(leftDes, currentLeft, middle, newLeft, newRight);
        int r2 = sumSegment(rightDes, middle + 1, currentRight, newLeft, newRight);
        return (r1 + r2) % MOD;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int ind = 1;
        while (T != 0) {
            for (int i = 0; i < TREE.length; i++) {
                TREE[i] = 0;
            }
            char[] str = new char[10005];
            String numbers = scanner.next();
            str = numbers.toCharArray();
            long result = 0;
            long numberSeq;
            for (int i = 0; i < str.length; i++) {
                int currentNumber = str[i] - '0';
                numberSeq = sumSegment(1, 1, 10, 1, currentNumber - 1) + 1;
                result = (result + numberSeq) % MOD;
                updateTree(1, 1, 10, currentNumber, currentNumber, (int) numberSeq);
            }
            System.out.println("Case " + ind + ": " + result);
            T--;
            ind++;
        }
    }
}
