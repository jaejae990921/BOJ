import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        double price = Double.parseDouble(st.nextToken());
        double g = Double.parseDouble(st.nextToken());
        double min = price / g * 100;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            price = Double.parseDouble(st.nextToken());
            g = Double.parseDouble(st.nextToken());

            if (price / g * 100 < min) {
                min = price / g * 100;
            }
        }

        min *= 10;
        sb.append(String.format("%.2f", min));
        System.out.println(sb);
    }
}