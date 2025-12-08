import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String temp = "";
        int cnt = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < N; i++) {
            temp = String.valueOf(i);

            if (temp.contains("50")) {
                cnt+=2;
            } else {
                cnt++;
            }
        }
        
        sb.append(cnt + 1);
        System.out.println(sb);
    }
}
