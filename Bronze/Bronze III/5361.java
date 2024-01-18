import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        float A, B, C, D, E, sum;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A = Float.parseFloat(st.nextToken()) * 350.34f;
            B = Float.parseFloat(st.nextToken()) * 230.90f;
            C = Float.parseFloat(st.nextToken()) * 190.55f;
            D = Float.parseFloat(st.nextToken()) * 125.30f;
            E = Float.parseFloat(st.nextToken()) * 180.90f;

            sum = A + B + C + D + E;

            sb.append(String.format("$%.2f\n", sum));
        }

        System.out.println(sb);
    }
}