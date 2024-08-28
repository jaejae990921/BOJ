import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        double diameter, turn, time;
        StringTokenizer st;
        int idx = 1;

        while (true) {
            st = new StringTokenizer(br.readLine());

            diameter = Double.parseDouble(st.nextToken());
            turn = Double.parseDouble(st.nextToken());
            time = Double.parseDouble(st.nextToken());

            if (turn == 0) {
                break;
            }

            double distance = (((diameter * 3.1415927) * turn) / 12) / 5280;
            double mph = distance / (time / 3600);

            sb.append("Trip #" + idx + ": ").append(String.format("%.2f", distance));
            sb.append(" ").append(String.format("%.2f", mph)).append("\n");

            idx++;
        }

        System.out.println(sb);
    }
}