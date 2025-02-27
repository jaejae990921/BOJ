import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String answer = "", temp = "";
        int idx = 0;

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i = 1; i <= n; i++) {
            if (i < 10) {
                if (i == n) {
                    answer = Integer.toString(i);
                    break;
                }

                temp = str.substring(idx, idx + 1);

                if (temp.equals(Integer.toString(i))) {
                    idx++;
                } else {
                    answer = Integer.toString(i);
                    break;
                }
            } else if (i < 100) {
                if (i == n) {
                    answer = Integer.toString(i);
                    break;
                }

                temp = str.substring(idx, idx + 2);

                if (temp.equals(Integer.toString(i))) {
                    idx += 2;
                } else {
                    answer = Integer.toString(i);
                    break;
                }
            } else {
                answer = Integer.toString(i);
            }
        }

        sb.append(answer);
        System.out.println(sb);
    }
}