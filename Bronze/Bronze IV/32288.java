import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String answer = "";

        int n = Integer.parseInt(br.readLine());
        String S = br.readLine();

        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == 'l') {
                answer += "L";
            } else {
                answer += "i";
            }
        }

        sb.append(answer);
        System.out.println(sb);
    }
}