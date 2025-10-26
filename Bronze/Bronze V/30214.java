import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        double S1 = Double.parseDouble(st.nextToken());
        double S2 = Double.parseDouble(st.nextToken());

        if (S1 >= S2 / 2) {
            sb.append("E");
        } else {
            sb.append("H");
        }

        System.out.println(sb);
    }
}