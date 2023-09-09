import java.util.Scanner;

public class Main {

    static int MOD = 11380;
    static int[][][][] memo = new int[11][11][11][31];

    static int solve(int L1, int L2, int L3, int D) {
        if (D < 0) return 0;
        if (L1 + L2 + L3 == 0) return 1;

        int ret = memo[L1][L2][L3][D];

        if (ret == 0) {
            ret = 0;

            for (int i = 0; i < L1; ++i)
                for (int j = 0; j <= L2; ++j)
                    for (int k = 0; k <= L3; ++k)
                        ret = (ret + solve(i, j, k, D - 1) * solve(L1 - 1 - i, L2 - j, L3 - k, D)) % MOD;

            for (int i = 0; i < L2; ++i)
                for (int j = 0; j <= L3; ++j)
                    ret = (ret + solve(0, i, j, D - 1) * solve(L1, L2 - 1 - i, L3 - j, D)) % MOD;

            for (int i = 0; i < L3; ++i)
                ret = (ret + solve(0, 0, i, D - 1) * solve(L1, L2, L3 - 1 - i, D)) % MOD;

            memo[L1][L2][L3][D] = ret;
        }

        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = 10;
        while (t-- > 0) {
            int L1, L2, L3, D;

            for (int i = 0; i < 11; i++)
                for (int j = 0; j < 11; j++)
                    for (int k = 0; k < 11; k++)
                        for (int l = 0; l < 31; l++)
                            memo[i][j][k][l] = -1;

            while (scanner.hasNext()) {
                L1 = scanner.nextInt();
                L2 = scanner.nextInt();
                L3 = scanner.nextInt();
                D = scanner.nextInt();

                int ans = solve(L1, L2, L3, D) - solve(L1, L2, L3, D - 1);
                if (ans < 0) ans += MOD;

                System.out.println(ans);
            }
        }
    }
}
