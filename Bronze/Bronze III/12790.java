import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int power;

        int[] stat = new int[8];

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 8; j++) {
                stat[j] = Integer.parseInt(st.nextToken());
            }

            for (int k = 0; k < 4; k++) {
                stat[k] = stat[k] + stat[k + 4];
            }

            stat[0] = stat[0] < 1 ? 1 : stat[0];
            stat[1] = stat[1] < 1 ? 1 : stat[1];
            stat[2] = stat[2] < 0 ? 0 : stat[2];

            power = stat[0] + 5 * stat[1] + 2 * stat[2] + 2 * stat[3];

            sb.append(power + "\n");
        }

        System.out.println(sb);
    }
}