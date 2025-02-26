import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        double R = Double.parseDouble(st.nextToken());
        double C = Double.parseDouble(st.nextToken());
        double N = Double.parseDouble(st.nextToken());

        long answer = (long) Math.ceil(R / N) * (long) Math.ceil(C / N);

        sb.append(answer);
        System.out.println(sb);
    }
}