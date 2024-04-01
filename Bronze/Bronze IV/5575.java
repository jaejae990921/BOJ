import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < 3; i++) {
          st = new StringTokenizer(br.readLine());

          int h = Integer.parseInt(st.nextToken());
          int m = Integer.parseInt(st.nextToken());
          int s = Integer.parseInt(st.nextToken());

          int h2 = Integer.parseInt(st.nextToken());
          int m2 = Integer.parseInt(st.nextToken());
          int s2 = Integer.parseInt(st.nextToken());

          int total = (h2 * 3600 + m2 * 60 + s2) - (h * 3600 + m * 60 + s);
          sb.append(total / 3600 + " " + total % 3600 / 60 + " " + total % 60 + "\n");
        }

        System.out.println(sb);
    }
}