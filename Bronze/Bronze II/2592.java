import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] count = new int[1001];
        int[] nums = new int[10];
        int sum = 0, max = 0;

        for (int i = 0; i < 10; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            count[nums[i]]++;
            sum += nums[i];
        }

        for (int i = 1; i <= 1000; i++) {
            if (count[i] > count[max]) {
                max = i;
            }
        }

        sb.append(sum / 10).append('\n').append(max);
        System.out.println(sb);
    }
}