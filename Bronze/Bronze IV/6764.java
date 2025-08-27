import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String answer = "No Fish";

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        if (a == b && b == c && c == d) {
            answer = "Fish At Constant Depth";
        } else if (a < b && b < c && c < d) {
            answer = "Fish Rising";
        } else if (a > b && b > c && c > d) {
            answer = "Fish Diving";
        }

        sb.append(answer);
        System.out.println(sb);
    }
}