import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int cnt = 0;

        st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int Z = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        cnt += Integer.parseInt(st.nextToken()) / 100 * X;
        cnt += Integer.parseInt(st.nextToken()) / 50 * Y;
        cnt += Integer.parseInt(st.nextToken()) / 20 * Z;

        sb.append(cnt);
        System.out.println(sb);
    }
}