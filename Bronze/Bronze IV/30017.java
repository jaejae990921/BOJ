import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int patty = Integer.parseInt(st.nextToken());
        int cheese = Integer.parseInt(st.nextToken());

        if (patty > cheese) {
            answer = cheese + cheese + 1;
        } else {
            answer = patty + patty - 1;
        }

        sb.append(answer);
        System.out.println(sb);
    }
}