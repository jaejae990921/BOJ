import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int answer = 0, min = Integer.MAX_VALUE, temp = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        if (X >= L && X <= R) {
            answer = X;
        } else {
            for (int i = L; i <= R; i++) {
                temp = Math.abs(X - i);

                if (temp < min) {
                    min = temp;
                    answer = i;
                }
            }
        }

        sb.append(answer);
        System.out.println(sb);
    }
}