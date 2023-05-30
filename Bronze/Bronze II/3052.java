import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.valueOf(br.readLine())%42;
            if (nums.contains(num)) {
                nums.add(num);
            }
            else {
                nums.add(num);
                cnt++;
            }
        }
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }
}