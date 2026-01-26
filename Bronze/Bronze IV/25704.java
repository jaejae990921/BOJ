import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int min = Integer.MAX_VALUE, temp = 0;

        int N = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        if (N >= 20) {
            temp = (int) (P * 0.75);
            min = Math.min(min, temp);
        }

        if (N >= 15) {
            temp = P - 2000;
            min = Math.min(min, temp);
        }

        if (N >= 10) {
            temp = (int) (P * 0.9);
            min = Math.min(min, temp);
        }

        if (N >= 5) {
            temp = P - 500;
            min = Math.min(min, temp);
        }

        if (min == Integer.MAX_VALUE) {
            min = P;
        }

        if (min < 0) {
            min = 0;
        }

        sb.append(min);
        System.out.println(sb);
    }
}