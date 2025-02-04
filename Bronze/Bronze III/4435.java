import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] gandalf = { 0, 1, 2, 3, 3, 4, 10 };
        int[] sauron = { 0, 1, 2, 2, 2, 3, 5, 10 };
        int gScore = 0, sScore = 0;

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= 6; j++) {
                gScore += Integer.parseInt(st.nextToken()) * gandalf[j];
            }

            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= 7; j++) {
                sScore += Integer.parseInt(st.nextToken()) * sauron[j];
            }

            sb.append("Battle " + i + ": ");

            if (gScore > sScore) {
                sb.append("Good triumphs over Evil\n");
            } else if (gScore < sScore) {
                sb.append("Evil eradicates all trace of Good\n");
            } else {
                sb.append("No victor on this battle field\n");
            }

            gScore = 0;
            sScore = 0;
        }

        System.out.println(sb);
    }
}