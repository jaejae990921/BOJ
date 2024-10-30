import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int answer = 1;

        int n = Integer.parseInt(br.readLine());
        int qt = (n % 2 == 0) ? n / 2 : n / 2 + 1;

        for (int i = 0; i < qt; i++) {
            answer = (answer * 2) % 16769023;
        }

        sb.append(answer);
        System.out.println(sb);
    }
}