import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        int cnt = 0;

        String find = br.readLine();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            str = br.readLine().repeat(2);

            if (str.contains(find)) {
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}