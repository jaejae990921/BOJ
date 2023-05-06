import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        int b = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < a; i++) {
            if (Integer.parseInt(nums[i]) == b) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}