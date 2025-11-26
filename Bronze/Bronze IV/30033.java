import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] nums;
        int cnt = 0, temp = 0;

        int N = Integer.parseInt(br.readLine());
        nums = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int j = 0; j < N; j++) {
            temp = Integer.parseInt(st.nextToken());

            if (temp >= nums[j]) {
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}