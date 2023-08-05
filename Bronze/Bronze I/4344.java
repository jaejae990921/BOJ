import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> nums = new ArrayList<Integer>();
        String[] str;
        int a;
        double avg;
        double cnt = 0;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            str = br.readLine().split(" ");
            a = Integer.parseInt(str[0]);
            for (int j = 0; j < a; j++) {
                nums.add(Integer.parseInt(str[j+1]));
            }
            avg = avg(nums);
            for (int k = 0; k < nums.size(); k++) {
                if (nums.get(k) > avg) {
                    cnt++;
                }
            }
            bw.write(String.format("%.3f", cnt / a * 100) + "%\n");
            cnt = 0;
            nums.clear();
        }
        bw.flush();
        bw.close();
    }

    public static double avg(ArrayList<Integer> nums) {
        double sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum / nums.size();
    }
}