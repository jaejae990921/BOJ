import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String[] str;
        int[] nums;
        int num = 0, start = 0, end = 0, mid = 0;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        str = new String[N];
        nums = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            str[i] = st.nextToken();
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < M; j++) {
            num = Integer.parseInt(br.readLine());

            start = 0;
            end = N - 1;

            while (start <= end) {
                mid = (start + end) / 2;

                if (nums[mid] < num) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            sb.append(str[start]).append("\n");
        }

        System.out.println(sb);
    }
}