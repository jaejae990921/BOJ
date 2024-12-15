import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int x1, y1, r1, x2, y2, r2;

        st = new StringTokenizer(br.readLine());

        x1 = Integer.parseInt(st.nextToken());
        y1 = Integer.parseInt(st.nextToken());
        r1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        x2 = Integer.parseInt(st.nextToken());
        y2 = Integer.parseInt(st.nextToken());
        r2 = Integer.parseInt(st.nextToken());

        int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        int r = r1 + r2;

        sb.append(d >= r ? "NO" : "YES");
        System.out.println(sb);
    }
}