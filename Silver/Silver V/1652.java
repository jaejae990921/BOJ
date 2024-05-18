import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int vCnt = 0, hCnt = 0;
        String input;

        int size = Integer.parseInt(br.readLine());
        boolean[][] vRoom = new boolean[size][size];
        boolean[][] hRoom = new boolean[size][size];

        for (int i = 0; i < size; i++) {
            input = br.readLine();

            for (int j = 0; j < size; j++) {
                if (input.charAt(j) == '.') {
                    vRoom[i][j] = true;
                    hRoom[i][j] = true;
                } else {
                    vRoom[i][j] = false;
                    hRoom[i][j] = false;
                }
            }
        }

        for (int k = 0; k < size; k++) {
            for (int l = 0; l < size - 1; l++) {
                if (vRoom[k][l] && vRoom[k][l + 1]) {
                    vCnt++;

                    for (int m = l; m < size; m++) {
                        if (!vRoom[k][m]) {
                            break;
                        }
                        vRoom[k][m] = false;
                    }
                }
            }
        }

        for (int n = 0; n < size; n++) {
            for (int o = 0; o < size - 1; o++) {
                if (hRoom[o][n] && hRoom[o + 1][n]) {
                    hCnt++;

                    for (int p = o; p < size; p++) {
                        if (!hRoom[p][n]) {
                            break;
                        }
                        hRoom[p][n] = false;
                    }
                }
            }
        }

        sb.append(vCnt + " " + hCnt);
        System.out.println(sb);
    }
}
