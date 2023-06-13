import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] nums = new int[10][10];
        int[] cnt = new int[10];
        String[] str;

        for (int i = 0; i < 10; i++) {
            str = br.readLine().split(" ");
            for (int j = 0; j <2; j++) {
                nums[i][j] = Integer.parseInt(str[j]);
            }
        }
        
        cnt[0] = nums[0][1];
        for (int j = 1; j < 9; j++) {
            cnt[j] = cnt[j-1] - nums[j][0] + nums[j][1];
        }
        cnt[9] = 0;

        bw.write(fm(cnt)+"");
        bw.flush();
        bw.close();
    }

    public static int fm(int[] cnt) {
        int max = cnt[0];
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
            }
        }
        return max;
    }
}