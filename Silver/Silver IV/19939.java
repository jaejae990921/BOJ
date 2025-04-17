import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int min = getMin(M);

        if (N < min) {
            sb.append("-1");
        } else {
            int answer = M - 1;
            N -= min;

            if (N % M != 0) {
                answer++;
            }

            sb.append(answer);
        }

        System.out.println(sb);
    }

    public static int getMin(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        return sum;
    }
}