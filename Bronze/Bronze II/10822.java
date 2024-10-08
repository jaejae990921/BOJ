import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), ",");

        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }

        sb.append(sum);
        System.out.println(sb);
    }
}