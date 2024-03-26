import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        int cnt = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            str = Integer.toString(i);

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') {
                    cnt++;
                }
            }
        }

        sb.append(cnt);
        System.out.print(sb);
    }
}