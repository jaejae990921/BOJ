import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        String str;

        String mbti = br.readLine();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            str = br.readLine();

            if (mbti.equals(str)) {
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}