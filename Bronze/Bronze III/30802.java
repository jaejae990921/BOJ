import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] tshirt = new int[6];
        StringTokenizer st;
        int cnt = 0;

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 6; i++) {
            tshirt[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        for (int j = 0; j < 6; j++) {
            cnt += Math.ceil((double) tshirt[j] / T);
        }

        sb.append(cnt).append("\n").append(N / P).append(" ").append(N % P);
        System.out.println(sb);
    }
}