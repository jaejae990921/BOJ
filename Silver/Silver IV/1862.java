import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int answer = 0, temp = 0;

        int N = Integer.parseInt(br.readLine());
        int len = Integer.toString(N).length();

        for (int i = 0; i < len; i++) {
            temp = N % 10;
            N /= 10;

            if (temp > 4) {
                answer += Math.pow(9, i) * (temp - 1);
            } else {
                answer += Math.pow(9, i) * temp;
            }
        }

        sb.append(answer);
        System.out.println(sb);
    }
}