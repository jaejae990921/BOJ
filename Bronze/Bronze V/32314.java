import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        sb.append((w / v) >= a ? 1 : 0);
        System.out.println(sb);
    }
}