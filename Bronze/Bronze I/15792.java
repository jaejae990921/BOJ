import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        BigDecimal A = new BigDecimal(st.nextToken());
        BigDecimal B = new BigDecimal(st.nextToken());
        BigDecimal answer = A.divide(B, 1001, BigDecimal.ROUND_DOWN);

        sb.append(answer);
        System.out.println(sb);
    }
}