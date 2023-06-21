import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        int sum = 0;
        int bonus = 0;
        boolean flag = false;

        for (int i = 0; i < num; i++) {
            if (nums[i].equals("1")) {
                sum++;
                if (flag) {
                    bonus++;
                    sum += bonus;
                }
                else {
                    flag = true;
                }
            }
            else {
                flag = false;
                bonus = 0;
            }
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}