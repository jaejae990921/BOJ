import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int base = Integer.parseInt(br.readLine());
        String nums;
        int num;

        while ((nums = br.readLine()) != null) {
            if (nums.equals("0")) {
                break;
            }
            else {
                num = Integer.parseInt(nums);
                if (num % base == 0) {
                    bw.write(num + " is a multiple of " + base + ".\n");
                }
                else {
                    bw.write(num + " is NOT a multiple of " + base + ".\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}