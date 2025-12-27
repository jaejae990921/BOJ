import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (B == C && B != A) {
            sb.append("A");
        } else if (A == C && A != B) {
            sb.append("B");
        } else if (A == B && A != C) {
            sb.append("C");
        } else {
            sb.append("*");
        }

        System.out.println(sb);
    }
}