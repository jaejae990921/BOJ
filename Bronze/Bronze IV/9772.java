import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String input = "";
        double x = 0, y = 0;

        while ((input = br.readLine()) != null) {
            st = new StringTokenizer(input);

            x = Double.parseDouble(st.nextToken());
            y = Double.parseDouble(st.nextToken());

            if (x > 0 && y > 0) {
                sb.append("Q1").append("\n");
            } else if (x < 0 && y > 0) {
                sb.append("Q2").append("\n");
            } else if (x < 0 && y < 0) {
                sb.append("Q3").append("\n");
            } else if (x > 0 && y < 0) {
                sb.append("Q4").append("\n");
            } else if (x == 0 || y == 0) {
                sb.append("AXIS").append("\n");
            }
        }

        System.out.println(sb);
    }
}