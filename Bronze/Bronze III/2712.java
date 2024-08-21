import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String unit;
        double num;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            num = Double.parseDouble(st.nextToken());
            unit = st.nextToken();

            if (unit.equals("kg")) {
                sb.append(String.format("%.4f", num * 2.2046)).append(" lb\n");
            } else if (unit.equals("lb")) {
                sb.append(String.format("%.4f", num * 0.4536)).append(" kg\n");
            } else if (unit.equals("l")) {
                sb.append(String.format("%.4f", num * 0.2642)).append(" g\n");
            } else if (unit.equals("g")) {
                sb.append(String.format("%.4f", num * 3.7854)).append(" l\n");
            }
        }

        System.out.println(sb);
    }
}