import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr;
        int cnt = 0;

        int N = Integer.parseInt(br.readLine());
        arr = br.readLine().split(" ");
        String track = br.readLine();

        for (int i = 0; i < N; i++) {
            if (arr[i].equals(track)) {
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}