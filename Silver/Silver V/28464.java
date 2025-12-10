import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] nums;
        int park = 0, seongwoo = 0, mid = 0;

        int N = Integer.parseInt(br.readLine());
        nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        mid = N / 2;

        for (int j = 0; j < N; j++) {
            if (j < mid) {
                seongwoo += nums[j];
            } else {
                park += nums[j];
            }
        }

        sb.append(seongwoo).append(" ").append(park);
        System.out.println(sb);
    }
}