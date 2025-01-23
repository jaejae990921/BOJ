import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int leaf = 0;
        int last = 0;

        if (m == 2) {
            leaf = 1;
        }

        for (int i = 1; i < n; i++) {
            if (m > leaf) {
                sb.append("0" + " " + i + "\n");
                leaf++;
            } else {
                sb.append(last + " " + i + "\n");
            }

            last = i;
        }

        System.out.println(sb);
    }
}