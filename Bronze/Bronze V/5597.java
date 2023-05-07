import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] nums = new char[30];
        Arrays.fill(nums, 'f');

        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            nums[n - 1] = 't';
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 'f') {
                bw.write((i + 1) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}