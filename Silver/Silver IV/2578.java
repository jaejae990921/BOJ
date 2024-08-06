import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] bingo = new int[5][5];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int cnt = 0, num;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int k = 0; k < 5; k++) {
            st = new StringTokenizer(br.readLine());
            for (int l = 0; l < 5; l++) {
                cnt++;
                num = Integer.parseInt(st.nextToken());

                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (bingo[i][j] == num) {
                            bingo[i][j] = 0;
                        }
                    }
                }

                if (countBingo()) {
                    sb.append(cnt);
                    break;
                }
            }

            if (countBingo()) {
                break;
            }
        }

        System.out.println(sb);
    }

    public static boolean countBingo() {
        boolean isBingo = false;
        int bingoCnt = 0, cnt;

        for (int i = 0; i < 5; i++) {
            cnt = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == 0) {
                    cnt++;
                }
            }
            if (cnt == 5) {
                bingoCnt++;
            }
        }

        for (int i = 0; i < 5; i++) {
            cnt = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[j][i] == 0) {
                    cnt++;
                }
            }
            if (cnt == 5) {
                bingoCnt++;
            }
        }

        cnt = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][i] == 0) {
                cnt++;
            }
        }

        if (cnt == 5) {
            bingoCnt++;
        }

        cnt = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][4 - i] == 0) {
                cnt++;
            }
        }

        if (cnt == 5) {
            bingoCnt++;
        }

        if (bingoCnt >= 3) {
            isBingo = true;
        }

        return isBingo;
    }
}