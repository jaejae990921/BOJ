import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int X = 0, min = 0, max = 0;

        int N = Integer.parseInt(br.readLine());
        int first = Integer.parseInt(br.readLine());
        min = first;
        max = first;

        for (int i = 0; i < N - 1; i++) {
            X = Integer.parseInt(br.readLine());

            if (X < min) {
                min = X;
            }
            if (X > max) {
                max = X;
            }
        }

        if (first == min) {
            sb.append("ez");
        } else if (first == max) {
            sb.append("hard");
        } else {
            sb.append("?");
        }

        System.out.println(sb);
    }
}