import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[][] arr = new String[10][10];
        StringTokenizer st;
        boolean flag = true, answer = false;
        String temp = "";

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 10; j++) {
                arr[i][j] = st.nextToken();
            }
        }

        for (int k = 0; k < 10; k++) {
            temp = arr[k][0];
            flag = true;
            for (int l = 1; l < 10; l++) {
                if (!arr[k][l].equals(temp)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer = true;
                break;
            }
        }

        for (int m = 0; m < 10; m++) {
            temp = arr[0][m];
            flag = true;
            for (int n = 1; n < 10; n++) {
                if (!arr[n][m].equals(temp)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer = true;
                break;
            }
        }

        sb.append(answer ? 1 : 0);
        System.out.println(sb);
    }
}