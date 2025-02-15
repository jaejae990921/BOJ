import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] a = new int[3];
        int[] c = new int[3];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            c[i] = Integer.parseInt(st.nextToken());
        }

        int bx = c[0] - a[2];
        int bz = c[1] / a[1];
        int by = c[2] - a[0];

        sb.append(bx).append(" ").append(bz).append(" ").append(by);
        System.out.println(sb);
    }
}