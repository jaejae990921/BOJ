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
        int a = Integer.parseInt(br.readLine());
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num;
        int sum = 0;

        for (int i = 0; i < a; i++) {
            num = Integer.parseInt(br.readLine());
            if (num == 0) {
                nums.remove(nums.size() - 1);
            } else {
                nums.add(num);
            }
        }
        for (int j = 0; j < nums.size(); j++) {
            sum += nums.get(j);
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}