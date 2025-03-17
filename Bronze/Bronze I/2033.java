import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int num = 10;

        while (N > num) {
            if (N % num >= num / 2) {
                N += num;
            }

            N -= N % num;
            num *= 10;
        }

        sb.append(N);
        System.out.println(sb);
    }
}